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
 
    try
    {
        con=Conexion.conectar();
        statement = con.createStatement();
        resultSet = statement.executeQuery("select correoUsuario,contrasenaUsuario,rolUsuario from Usuario");
 
        while(resultSet.next())
        {
            userNameDB = resultSet.getString("correoUsuario");
            passwordDB = resultSet.getString("contrasenaUsuario");
            roleDB = resultSet.getString("rolUsuario");
 
            if(correoUsuario.equals(userNameDB) && contrasena.equals(passwordDB) && roleDB.equals("Jefe"))
            return "Jefe_Rol";
            else if(correoUsuario.equals(userNameDB) && contrasena.equals(passwordDB) && roleDB.equals("Supervisor"))
            return "Supervisor_Rol";
            else if(correoUsuario.equals(userNameDB) && contrasena.equals(passwordDB) && roleDB.equals("Conductor"))
            return "Conductor_Rol";
            else if(correoUsuario.equals(userNameDB) && contrasena.equals(passwordDB) && roleDB.equals("Montacarga"))
            return "Montacarga_Rol";
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    return "Correo o contraseña invalidas";
}
}