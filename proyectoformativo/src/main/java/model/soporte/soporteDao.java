package model.soporte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Conexion;

public class soporteDao {

    Connection con; 
    PreparedStatement ps; 
    ResultSet rs; 
    String sql=null;
    int filas; 

    //REGISTRAR O INSERTAR 
    public int registrar(soporteVo Soporte) throws SQLException{
        sql="INSERT INTO Soporte(tipoSoporte,descripcionSoporte,fechaRegistro,fechaSoporte,soporte) values(?,?,?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, Soporte.getTipoSoporte());
            ps.setString(2, Soporte.getDescripcionSoporte());
            ps.setString(3, Soporte.getFechaRegistro());
            ps.setString(4, Soporte.getFechaSoporte());
            ps.setString(5,Soporte.getSoporte());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el soporte correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }
        //  CONSULTAR
        public List<soporteVo> soporteList() throws SQLException{
            List<soporteVo> soporte=new ArrayList<>();
            sql="SELECT * FROM Soporte";
            try {
                con=Conexion.conectar();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery(sql);
                while(rs.next()){
                    soporteVo filas=new soporteVo();
                    //Escribir  en el setter cada valor encontrado
                    filas.setIdSoporte(rs.getInt("idSoporte"));
                    filas.setTipoSoporte(rs.getString("tipoSoporte"));
                    filas.setDescripcionSoporte(rs.getString("descripcionSoporte"));
                    filas.setFechaRegistro(rs.getString("fechaRegistro"));
                    filas.setFechaSoporte(rs.getString("fechaSoporte"));
                    filas.setSoporte(rs.getString("soporte"));
                    filas.setEstadoSoporte(rs.getBoolean("estadoSoporte"));
                    soporte.add(filas);
                }
                ps.close();
                System.out.println("consulta exitosa");
            } catch (Exception e) {
                System.out.println("La consulta no pudo ser ejecutada "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
            return soporte;
        }
        
    //Eliminar 
    public void eliminar (int idSoporte) throws SQLException {
        sql="DELETE FROM Soporte WHERE idSoporte="+idSoporte;
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

    //Estado
    public void estado(Boolean estadoSoporte, int idSoporte) throws SQLException {
        sql="UPDATE Soporte SET estadoSoporte= " +estadoSoporte+ " WHERE idSoporte= " +idSoporte;
        try { 
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se cambio el estado a "+estadoSoporte+" correctamente");
        }catch(Exception e){
            System.out.println("Error no se puede cambiar el estado "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
    }

    
    //Editar
    public List<soporteVo> editar(int idSoporte) throws SQLException{
        List<soporteVo> Soporte=new ArrayList<>();
        sql="SELECT * FROM Soporte WHERE idSoporte="+idSoporte;
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                soporteVo r=new soporteVo();
                //Escribir  en el setter cada valor encontrado
                r.setIdSoporte(rs.getInt("idSoporte"));
                r.setTipoSoporte(rs.getString("tipoSoporte"));
                r.setSoporte(rs.getString("soporte"));
                r.setFechaRegistro(rs.getString("fechaRegistro"));
                r.setFechaSoporte(rs.getString("fechaSoporte"));
                r.setEstadoSoporte(rs.getBoolean("estadoSoporte"));
                Soporte.add(r);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

        return Soporte;
    }
    
    //Actualizar
    public int Actualizar (soporteVo Soporte) throws SQLException {
        sql="UPDATE Soporte SET tipoSoporte=?, soporte=?, fechaRegistro=?, fechaSoporte=?, estadoSoporte=? WHERE idSoporte=?";
        try { 
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.setString(1, Soporte.getTipoSoporte());
            ps.setString(2, Soporte.getSoporte());
            ps.setString(3, Soporte.getFechaRegistro());
            ps.setString(4, Soporte.getFechaSoporte());
            ps.setBoolean(5, Soporte.isEstadoSoporte());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se edito el soporte correctamente");

        }catch(Exception e){
            System.out.println("Error al editar "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }
}
