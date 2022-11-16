package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.empleado.empleadoDao;
import model.horarioAsignado.asigHorarioDao;
import model.horarioAsignado.asigHorarioVo;
import model.empleado.empleadoVo;

public class empleadoController extends HttpServlet {
    empleadoVo r = new empleadoVo();
    empleadoDao rd = new empleadoDao();

    asigHorarioVo rc = new asigHorarioVo();
    asigHorarioDao rz = new asigHorarioDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String a = req.getParameter("action");
        System.out.println(a);
        switch (a) {
            case "ingresar":
            consultarEmpleado(req,resp);
            ingresar(req, resp);
            break;
            case "listar":
            empleadoList(req, resp);
            break;     
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a = req.getParameter("action");

        switch (a) {
            case "add":
                add(req, resp);
                break;
        }
    }
    //nombrese desde base de datos
    private void consultarEmpleado(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List<asigHorarioVo> asigHorario=rz.Asiglistar();
            req.setAttribute("Asiglistar", asigHorario);
            System.out.println("Datos del rol listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas");
        }
    }
    private void ingresar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("views/empleado/empleadoAdd.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        } catch (Exception e) {
            System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
        }
    }
  
    private void add(HttpServletRequest req, HttpServletResponse resp) {

        if (req.getParameter("correoUsuario") != null) {
            r.setCorreoUsuario(req.getParameter("correoUsuario"));
        }
        if (req.getParameter("contrasenaUsuario") != null) {
            r.setContrasenaUsuario(req.getParameter("contrasenaUsuario"));
        }
        if (req.getParameter("rolUsuario") != null) {
            r.setRolUsuario(req.getParameter("rolUsuario"));
        }
        if (req.getParameter("estadoUsuario") != null) {
            r.setEstadoUsuario(true);
        } else {
            r.setEstadoUsuario(false);
        }
        if (req.getParameter("tipoDocEmpleado") != null) {
            r.setTipoDocEmpleado(req.getParameter("tipoDocEmpleado"));
        }
        if (req.getParameter("docEmpleado") != null) {
            r.setDocEmpleado(req.getParameter("docEmpleado"));
        }

        if (req.getParameter("nombreEmpleado") != null) {
            r.setNombreEmpleado(req.getParameter("nombreEmpleado"));
        }

        if (req.getParameter("apellidoEmpleado") != null) {
            r.setApellidoEmpleado(req.getParameter("apellidoEmpleado"));
        }

        if (req.getParameter("celularEmpleado") != null) {
            r.setCelularEmpleado(req.getParameter("celularEmpleado"));
        }

        if (req.getParameter("direccionEmpleado") != null) {
            r.setDireccionEmpleado(req.getParameter("direccionEmpleado"));
        }

        if (req.getParameter("fotoEmpleado") != null) {
            r.setFotoEmpleado(req.getParameter("fotoEmpleado"));
        }
        if (req.getParameter("idHorarioAsignado") != null) {
            rc.setIdHorarioAsignado(Integer.parseInt(req.getParameter("idHorarioAsignado")));
        }
        try {
            rd.registrar(r, rc);
            System.out.println("Registro insertado correctamente");
            empleadoList(req, resp);
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
        }
        
    }

    private void empleadoList(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List<empleadoVo> empleadoL = rd.empleadoList();
            req.setAttribute("empleadoList", empleadoL);
            req.getRequestDispatcher("views/empleado/empleadoList.jsp").forward(req, resp);
            System.out.println("Datos listados de manera correcta");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos " + e.getMessage().toString());
        }
    }
}