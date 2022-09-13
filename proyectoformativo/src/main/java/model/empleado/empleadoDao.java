package model.empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Conexion;

public class empleadoDao {
    
    //Atributos para las operacinones 

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql=null;
    int filas;
    public int registrar(empleadoVo empleado) throws SQLException{
        sql="CALL add_Empleado(?,?,?,?,?,?,?,?,?,?)";
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, empleado.getCorreoUsuario());
            ps.setString(2, empleado.getRolUsuario());//
            ps.setBoolean(3, empleado.getEstadoUsuario());
            ps.setString(4, empleado.getTipoDocEmpleado());//
            ps.setString(5, empleado.getDocEmpleado());//
            ps.setString(6, empleado.getNombreEmpleado());//
            ps.setString(7, empleado.getApellidoEmpleado());//
            ps.setString(8, empleado.getCelularEmpleado());//
            ps.setString(9, empleado.getDireccionEmpleado());//
            ps.setString(10, empleado.getFotoEmpleado());//


            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("Se creo el empleado correctamente");
        }catch(Exception e){
            System.out.println("Error al momento de crear el empleado "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;//retornar numero de filas
     }
     public List<empleadoVo> empleadoList() throws SQLException{
        List<empleadoVo> empleado= new ArrayList<>();
        sql="SELECT Usuario.idUsuario, Empleado.nombreEmpleado, Empleado.apellidoEmpleado,Empleado.docEmpleado, Usuario.correoUsuario, Usuario.estadoUsuario FROM Usuario INNER JOIN Empleado ON Usuario.idUsuario=Empleado.idUsuario;";
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            System.out.println(ps);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                empleadoVo filas=new empleadoVo();
                filas.setIdUsuario(rs.getInt("idUsuario"));
                filas.setNombreEmpleado(rs.getString("nombreEmpleado"));
                filas.setApellidoEmpleado(rs.getString("apellidoEmpleado"));
                filas.setDocEmpleado(rs.getString("docEmpleado"));
                filas.setCorreoUsuario(rs.getString("correoUsuario"));
                filas.setEstadoUsuario(rs.getBoolean("estadoUsuario"));
                empleado.add(filas);
            }
            ps.close();
            System.out.println("Consulta exitosa");
        }catch (Exception e){
            System.out.println("La consulta no pudo ser ejecutada "+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        return empleado;
    }
    public void eliminar(int id) throws SQLException{
        sql = "CALL delete_Empleado ('?','?');"+id;
        try{
            con=Conexion.conectar(); 
            ps=con.prepareStatement(sql); 
            System.out.println(ps);
            ps.executeUpdate(); 
            ps.close(); 
            System.out.println("Se elimino correctamente"); 
        }catch(Exception e){
            System.out.println("Error en la eliminación "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
    }
    
    //VALIDACION DE USUARIOS 
    
    public List <empleadoVo> login(String correoUsuario, String contrasenaUsuario) throws SQLException{
        List  empleado=new ArrayList();
        sql="SELECT idUsuario, correoUsuario, contrasenaUsuario, rolUsuario, estadoUsuario FROM Usuario WHERE correoUsuario = '"+correoUsuario+"' AND contrasenaUsuario = '"+contrasenaUsuario+"'";
        List oso = new ArrayList();
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                empleadoVo filas=new empleadoVo();
                //Escribir  en el setter cada valor encontrado
                filas.setCorreoUsuario(rs.getString("correoUsuario"));
                filas.setContrasenaUsuario(rs.getString("contrasenaUsuario"));
                filas.setRolUsuario(rs.getString("rolUsuario"));
                filas.setEstadoUsuario(rs.getBoolean("estadoUsuario"));

                oso.add(rs.getInt("idUsuario"));
                oso.add(rs.getString("correoUsuario"));
                oso.add(rs.getString("contrasenaUsuario"));
                oso.add(rs.getString("rolUsuario"));
                oso.add(rs.getBoolean("estadoUsuario"));

                empleado.add(filas);
              /*   System.out.println(rs.getString("correoUsuario"));
                System.out.println(rs.getString("contrasenaUsuario"));
                System.out.println(rs.getString("rolUsuario"));
                System.out.println(rs.getBoolean("estadoUsuario")); */
            }
            ps.close();
            System.out.println("consulta exitosa ");
            
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
        }
        finally{
            con.close();
        }
        
        //System.out.println(oso);
        return oso;//retorna array con los datos de la tabla
    }
}