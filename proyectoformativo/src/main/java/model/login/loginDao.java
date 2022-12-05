package model.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Conexion;


public class loginDao {
    
    public String authenticateUser(loginVo loginVo){
    String correoUsuario = loginVo.getCorreoUsuario();
    String contrasena = loginVo.getContrasenaUsuario();
 
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
 
    String userNameDB = "";
    String passwordDB = "";
    String roleDB = "";
    String idUsuarioDB = "";
    String nombreUsuarioDB = "";
    String apellidoUsuarioDB = "";
   
 
    try
    {
        con=Conexion.conectar();
        statement = con.createStatement();
        resultSet = statement.executeQuery("select u.idUsuario, u.correoUsuario, u.contrasenaUsuario, u.rolUsuario, e.nombreEmpleado, e.apellidoEmpleado\n" +
        "from Usuario u \n" +
        "INNER JOIN empleado e ON u.idUsuario = e.idUsuario;");
 
        while(resultSet.next())
        {
            
            idUsuarioDB = resultSet.getString("idUsuario");
            userNameDB = resultSet.getString("correoUsuario");
            passwordDB = resultSet.getString("contrasenaUsuario");
            roleDB = resultSet.getString("rolUsuario");
            nombreUsuarioDB = resultSet.getString("nombreEmpleado");
            apellidoUsuarioDB = resultSet.getString("apellidoEmpleado");
            
            
 
            if(correoUsuario.equals(userNameDB) && contrasena.equals(passwordDB) && roleDB.equals("Jefe")){
             
             return idUsuarioDB+","+userNameDB+","+roleDB+","+nombreUsuarioDB+","+apellidoUsuarioDB;
             
            }else if(correoUsuario.equals(userNameDB) && contrasena.equals(passwordDB) && roleDB.equals("Supervisor"))
            return idUsuarioDB+","+userNameDB+","+roleDB+","+nombreUsuarioDB+","+apellidoUsuarioDB;
            else if(correoUsuario.equals(userNameDB) && contrasena.equals(passwordDB) && roleDB.equals("Conductor"))
           return idUsuarioDB+","+userNameDB+","+roleDB+","+nombreUsuarioDB+","+apellidoUsuarioDB;
            else if(correoUsuario.equals(userNameDB) && contrasena.equals(passwordDB) && roleDB.equals("Montacarga"))
            return idUsuarioDB+","+userNameDB+","+roleDB+","+nombreUsuarioDB+","+apellidoUsuarioDB;
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    return "Correo o contraseña invalidas";
}
}