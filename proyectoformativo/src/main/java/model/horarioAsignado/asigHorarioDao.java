package model.horarioAsignado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Conexion;

public class asigHorarioDao {
    
    Connection con; //Objeto de conexion
    PreparedStatement ps; //Objeto para sentencias preparadas
    ResultSet rs; //Objeto pa almacenar consultas
    String sql=null; //Variable para guardar sentencias
    int filas; //Cantidad de filas que dfevuelve una sentencia
 
    //Registrar 
    public int registrar(asigHorarioVo asigHorario) throws SQLException{
        sql="INSERT INTO HorarioAsignado(horaEntradaAsignada, horaSalidaAsignada, estadoHorario) VALUES (?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, asigHorario.getHoraEntradaAsignada());
            ps.setString(2, asigHorario.getHoraSalidaAsignada());
            ps.setBoolean(3, asigHorario.isEstadoHorario());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el Horario Asignado correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }

    //Listar
    public List<asigHorarioVo> Asiglistar() throws SQLException{
        List<asigHorarioVo> asigHorarios=new ArrayList<>();
        sql="SELECT * FROM HorarioAsignado";
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                asigHorarioVo filas=new asigHorarioVo();
                //Escribir  en el setter cada valor encontrado
                filas.setIdHorarioAsignado(rs.getInt("idHorarioAsignado"));
                filas.setHoraEntradaAsignada(rs.getString("horaEntradaAsignada"));
                filas.setHoraSalidaAsignada(rs.getString("horaSalidaAsignada"));
                filas.setEstadoHorario(rs.getBoolean("estadoHorario"));
                asigHorarios.add(filas);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutada "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

        return asigHorarios;
    }

     //Eliminar 
     public void eliminar (int idHorarioAsignado) throws SQLException {
        sql="DELETE FROM HorarioAsignado WHERE idHorarioAsignado="+idHorarioAsignado;
        try {
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se elimino correctamente");
        }catch(Exception e){
            System.out.println("Error al eliminar "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
    }

     //Editar
     public List<asigHorarioVo> listarAsig(int idHorarioAsignado) throws SQLException{
        List<asigHorarioVo> asigHorario=new ArrayList<>();
        sql="SELECT * FROM HorarioAsignado WHERE idHorarioAsignado="+idHorarioAsignado;
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                asigHorarioVo filas=new asigHorarioVo();
                //Escribir  en el setter cada valor encontrado
                filas.setIdHorarioAsignado(rs.getInt("idHorarioAsignado"));
                filas.setHoraEntradaAsignada(rs.getString("horaEntradaAsignada"));
                filas.setHoraSalidaAsignada(rs.getString("horaSalidaAsignada"));
                filas.setEstadoHorario(rs.getBoolean("estadoHorario"));
                asigHorario.add(filas);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutada "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

        return asigHorario;
    }

     //Actualizar
     public int actualizar (asigHorarioVo asigHorario) throws SQLException {
        sql="UPDATE HorarioAsignado SET horaEntradaAsignada=?, horaSalidaAsignada=?, estadoHorario=? WHERE idHorarioAsignado=?";
        try { 
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.setInt(1, asigHorario.getIdHorarioAsignado());
            ps.setString(2, asigHorario.getHoraEntradaAsignada());
            ps.setString(3, asigHorario.getHoraSalidaAsignada());
            ps.setBoolean(4, asigHorario.isEstadoHorario());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se edito el Horario Asignado correctamente");

        }catch(Exception e){
            System.out.println("Error al editar "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }
}
