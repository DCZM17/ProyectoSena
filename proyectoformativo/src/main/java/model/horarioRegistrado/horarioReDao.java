package model.horarioRegistrado;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Conexion;

public class horarioReDao {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    int filas;
    int s;

    public List<horarioReVo> listar() throws SQLException{
        List<horarioReVo> horarioRegistrado = new ArrayList<>();
        sql = "SELECT a.idHorarioRegistrado, a.horaEntradaRegistrada, a.horaSalidaRegistrada, a.horaInicioAlmuerzo, a.horaFinAlmuerzo, a.fechaRegistro, a.estadoHorarioRegistrado, a.idEmpleadoH, e.nombreEmpleado, e.apellidoEmpleado FROM horarioRegistrado a INNER JOIN empleado e ON a.idEmpleadoH = e.idEmpleado;";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            System.out.println(ps);
            rs = ps.executeQuery(sql);
                
                while (rs.next()) {
                    horarioReVo filas = new horarioReVo();
                    
                    filas.setIdHorarioRegistrado(rs.getInt("idHorarioRegistrado"));
                    filas.setHoraEntradaRegistrada(rs.getString("horaEntradaRegistrada"));
                    filas.setHoraSalidaRegistrada(rs.getString("horaSalidaRegistrada"));
                    filas.setHoraInicioAlmuerzo(rs.getString("horaInicioAlmuerzo"));
                    filas.setHoraFinAlmuerzo(rs.getString("horaFinAlmuerzo"));
                    filas.setFechaRegistro(rs.getString("fechaRegistro"));
                    filas.setEstadoHorarioRegistrado(rs.getInt("estadoHorarioRegistrado"));
                    filas.setIdEmpleadoH(rs.getInt("idEmpleadoH"));
                    filas.setNombreEmpleado(rs.getString("nombreEmpleado"));
                    filas.setApellidoEmpleado(rs.getString("apellidoEmpleado"));

                    horarioRegistrado.add(filas);
                    
                }
                ps.close();
                System.out.println("consulta exitosa");
            } catch (Exception e) {
                System.out.println("La consulta no se pudo ejecutar "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
    
            return horarioRegistrado;
        }
    
    //LISTAR POR ID 
    
    public List<horarioReVo> listarId(int idEmpleado) throws SQLException{
        List<horarioReVo> horarioRegistrado = new ArrayList<>();
        sql = "SELECT a.idHorarioRegistrado, a.horaEntradaRegistrada, a.horaSalidaRegistrada, a.horaInicioAlmuerzo, a.horaFinAlmuerzo, a.fechaRegistro, a.estadoHorarioRegistrado, a.idEmpleadoH, e.nombreEmpleado, e.apellidoEmpleado FROM horarioRegistrado a INNER JOIN empleado e ON a.idEmpleadoH = e.idEmpleado WHERE e.idEmpleado="+idEmpleado;
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            System.out.println(ps);
            rs = ps.executeQuery(sql);
                
                while (rs.next()) {
                    horarioReVo filas = new horarioReVo();
                    filas.setIdHorarioRegistrado(rs.getInt("idHorarioRegistrado"));
                    filas.setHoraEntradaRegistrada(rs.getString("horaEntradaRegistrada"));
                    filas.setHoraSalidaRegistrada(rs.getString("horaSalidaRegistrada"));
                    filas.setHoraInicioAlmuerzo(rs.getString("horaInicioAlmuerzo"));
                    filas.setHoraFinAlmuerzo(rs.getString("horaFinAlmuerzo"));
                    filas.setFechaRegistro(rs.getString("fechaRegistro"));
                    filas.setEstadoHorarioRegistrado(rs.getInt("estadoHorarioRegistrado"));
                    filas.setIdEmpleadoH(rs.getInt("idEmpleadoH"));
                    filas.setNombreEmpleado(rs.getString("nombreEmpleado"));
                    filas.setApellidoEmpleado(rs.getString("apellidoEmpleado"));

                    horarioRegistrado.add(filas);
                }
                ps.close();
                System.out.println("consulta exitosa");
            } catch (Exception e) {
                System.out.println("La consulta no se pudo ejecutar "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
    
            return horarioRegistrado;
        }

        //AGREGAR
    public int add(horarioReVo horarioRegistrado) throws SQLException{
        sql="INSERT INTO horarioRegistrado (horaEntradaRegistrada, estadoHorarioRegistrado, idEmpleadoH) values(?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, horarioRegistrado.getHoraEntradaRegistrada());
            ps.setInt(2, horarioRegistrado.getEstadoHorarioRegistrado());
            ps.setInt(3, horarioRegistrado.getIdEmpleadoH());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el horario correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }

    //actualizar salida almuerzo
    public int actualizar_almuerzo(horarioReVo horarioRegistrado) throws SQLException{
        sql="UPDATE horarioRegistrado SET horaInicioAlmuerzo =?, estadoHorarioRegistrado =2 WHERE idHorarioRegistrado =?";
    
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            System.out.println(ps);
            ps.setString(1, horarioRegistrado.getHoraInicioAlmuerzo());
            ps.setInt(2, horarioRegistrado.getIdHorarioRegistrado());
    
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("Se inserto la hora salida del almuerzo correctamente");
    
            
        }catch(Exception e){
            System.out.println("Error al editar "+e.getMessage().toString());
        }
    
        finally{
            con.close();
        }
        return filas;
        }

     //actualizar entrada almuerzo
     public int actualizar_almuerzo_entrada(horarioReVo horarioRegistrado) throws SQLException{
        sql="UPDATE horarioRegistrado SET horaFinAlmuerzo =?, estadoHorarioRegistrado =3 WHERE idHorarioRegistrado =?";
    
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            System.out.println(ps);
            ps.setString(1, horarioRegistrado.getHoraFinAlmuerzo());
            ps.setInt(2, horarioRegistrado.getIdHorarioRegistrado());
    
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("Se inserto la hora de entrada del almuerzo correctamente");
    
            
        }catch(Exception e){
            System.out.println("Error al editar "+e.getMessage().toString());
        }
    
        finally{
            con.close();
        }
        return filas;
        }       

    //ACTUALIZAR HORA DE SALIDA
    public int add_salida (horarioReVo horarioRegistrado) throws SQLException{
        sql="UPDATE horarioRegistrado SET horaSalidaRegistrada =?, estadoHorarioRegistrado =4 WHERE idHorarioRegistrado =?";
    
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            System.out.println(ps);
            ps.setString(1, horarioRegistrado.getHoraSalidaRegistrada());
            ps.setInt(2, horarioRegistrado.getIdHorarioRegistrado());
    
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("Se inserto la hora de salida correctamente");
    
            
        }catch(Exception e){
            System.out.println("Error al editar "+e.getMessage().toString());
        }
    
        finally{
            con.close();
        }
        return filas;
        }
}
