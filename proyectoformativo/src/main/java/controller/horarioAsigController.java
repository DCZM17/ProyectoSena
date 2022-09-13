package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.horarioAsignado.asigHorarioDao;
import model.horarioAsignado.asigHorarioVo;

public class horarioAsigController extends HttpServlet{

    asigHorarioVo r = new asigHorarioVo();
    asigHorarioDao rd = new asigHorarioDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Entró al DoGet");
        String a=req.getParameter("action");
        System.out.println(a);
    
        switch(a){
            case "abrirAsigHorario":
            abrirAsigHorario(req, resp);
            break;
            case "listar":
            Asiglistar(req, resp);
            break;
            case "editar":
            editar(req,resp);
            break;
            case "eliminar":
            eliminar(req,resp);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a=req.getParameter("action");
        System.out.println(a);
        
        switch(a){
           case "add":
           add (req, resp);
           break;
           case "edit":
           edit (req, resp);
           break;
     }
}

    //abiriAsigHorario
    private void abrirAsigHorario(HttpServletRequest req, HttpServletResponse resp) {
    try{
        req.getRequestDispatcher("views/horarioAsignado/horarioAsignadoAdd.jsp").forward(req, resp);
        System.out.println("Se ha registrado Correctamente");
    }catch(Exception e){
        System.out.println("No se ha registrado"+e.getMessage().toString());
    }
    }
    //Add
    private void add(HttpServletRequest req, HttpServletResponse resp) {
    if(req.getParameter("horaEntradaAsignada")!=null){
        r.setHoraEntradaAsignada(req.getParameter("horaEntradaAsignada"));
    }
    if(req.getParameter("horaSalidaAsignada")!=null){
        r.setHoraSalidaAsignada(req.getParameter("horaSalidaAsignada"));
    }
    if(req.getParameter("estadoHorario")!=null){
        r.setEstadoHorario(true);
    }
    else{
        r.setEstadoHorario(false);
    }
    try {
        rd.registrar(r);
        System.out.println("Registro insertado correctamente");
        Asiglistar(req, resp);
    } catch (Exception e) {
        System.out.println("Error en la inserción del registro "+e.getMessage().toString());
    }
    }
    //Listar
private void Asiglistar(HttpServletRequest req, HttpServletResponse resp) {
    try{
        List <asigHorarioVo> asigHorario=rd.Asiglistar();
        req.setAttribute("Asiglistar", asigHorario);
        req.getRequestDispatcher("views/horarioAsignado/horarioAsignadoList.jsp").forward(req, resp);
        System.out.println("Datos listados correctamente");
    }catch (Exception e){
        System.out.println("Hay problemas al listar los datos "+ e.getMessage().toString());
    }
    }
        //Eliminar
private void eliminar(HttpServletRequest req, HttpServletResponse resp) {
    if (req.getParameter("idHorarioAsignado")!=null){
        r.setIdHorarioAsignado(Integer.parseInt(req.getParameter("idHorarioAsignado")));
    }
    try{
        rd.eliminar(r.getIdHorarioAsignado());
        System.out.println("El estad se ha eliminado correctamente");
        Asiglistar(req, resp);
    }catch(Exception e) {
        System.out.println("El estado no se pudo eliminar "+e.getMessage().toString());
    }
    }
    
    //Editar direccionamiento
    private void editar(HttpServletRequest req, HttpServletResponse resp) {
    if(req.getParameter("idHorarioAsignado")!=null){
        r.setIdHorarioAsignado(Integer.parseInt(req.getParameter("idHorarioAsignado")));
    }
    try{
        List <asigHorarioVo> asigHorario=rd.listarAsig(r.getIdHorarioAsignado());
        req.setAttribute("listarHorarioAsig", asigHorario);
        req.getRequestDispatcher("views/horarioAsignado/horarioAsignadoEdit.jsp").forward(req, resp);
        System.out.println("Datos listados correctamente");
    }catch (Exception e) {
        System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
    }
    }
    //Edit accion
    private void edit(HttpServletRequest req, HttpServletResponse resp) {
    if(req.getParameter("idHorarioAsignado")!=null) {
        r.setIdHorarioAsignado(Integer.parseInt(req.getParameter("idHorarioAsignado")));
    }
    
    if(req.getParameter("horaEntradaAsignada")!=null){
        r.setHoraEntradaAsignada(req.getParameter("horaEntradaAsignada"));
    }
    
    if(req.getParameter("horaSalidaAsignada")!=null){
        r.setHoraSalidaAsignada(req.getParameter("horaSalidaAsignada"));
    }
    
    if(req.getParameter("estadoHorario")!=null){
        r.setEstadoHorario(true);
    }
    
    else{
        r.setEstadoHorario(false);
    }
    
    try {
        rd.actualizar(r);
        System.out.println("El horario ha sido editado correctamente");
        Asiglistar(req, resp);
    } catch (Exception e) {
        System.out.println("Error no se edito el registro "+e.getMessage().toString());
    }
    }
}
