package controller;

//IMPORTACIONES
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.soporte.soporteDao;
import model.soporte.soporteVo;

public class soporteController extends HttpServlet {
    soporteVo r = new soporteVo();
    soporteDao rd = new soporteDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String a = req.getParameter("action");
        System.out.println(a);

        switch (a) {
            case "registrar":
                registrar(req, resp);
                break;
            case "eliminar":
                eliminar(req, resp);
                break;
            case "listar":
                soporteList(req, resp);
                break;
            case "editar":
                editar(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a = req.getParameter("action");
        System.out.println(a);

        switch (a) {
            case "registraradd":
                registraradd(req, resp);
                break;
            case "edit":
                edit(req, resp);
                break;
        }
    }

    private void registrar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("views/Soportes/soporteAdd.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        } catch (Exception e) {
            System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
        }
    }

    private void registraradd(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("tipoSoporte") != null) {
            r.setTipoSoporte(req.getParameter("tipoSoporte"));
        }
        if (req.getParameter("descripcionSoporte") != null) {
            r.setDescripcionSoporte(req.getParameter("descripcionSoporte"));
        }
        if (req.getParameter("fechaRegistro") != null) {
            r.setFechaRegistro(req.getParameter("fechaRegistro"));
        }
        if (req.getParameter("fechaSoporte") != null) {
            r.setFechaSoporte(req.getParameter("fechaSoporte"));
        }
        if (req.getParameter("soporte") != null) {
            r.setSoporte(req.getParameter("soporte"));
        }
        try {
            rd.registrar(r);
            System.out.println("Registro insertado correctamente");
            soporteList(req, resp);
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
        }
    }

    private void soporteList(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List<soporteVo> soporteL = rd.soporteList();
            req.setAttribute("soporteList", soporteL);
            req.getRequestDispatcher("views/Soportes/soporteList.jsp").forward(req, resp);
            System.out.println("Datos Consultados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al Consultar los datos " + e.getMessage().toString());
        }
    }

    // eliminar
    private void eliminar(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("idSoporte") != null) {
            r.setIdSoporte(Integer.parseInt(req.getParameter("idSoporte")));// Cambiar de string a int
        }
        try {
            rd.eliminar(r.getIdSoporte());
            ;
            System.out.println("El estado se cambio exitosamente");
            soporteList(req, resp);
        } catch (Exception e) {
            System.out.println("Error en el cambio de estado " + e.getMessage().toString());
        }
    }

    // Editar direccionamiento
    private void editar(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("idSoporte") != null) {
            r.setIdSoporte(Integer.parseInt(req.getParameter("idSoporte")));
        }
        try {
            List<soporteVo> Soporte = rd.soporteList(r.getIdSoporte());
            req.setAttribute("listarSoporte", Soporte);
            req.getRequestDispatcher("views/Soportes/soporteEdit.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos " + e.getMessage().toString());
        }
    }

    // Edit accion
    private void edit(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("tipoSoporte") != null) {
            r.setTipoSoporte(req.getParameter("tipoSoporte"));
        }
        if (req.getParameter("descripcionSoporte") != null) {
            r.setDescripcionSoporte(req.getParameter("descripcionSoporte"));
        }
        if (req.getParameter("fechaRegistro") != null) {
            r.setFechaRegistro(req.getParameter("fechaRegistro"));
        }
        if (req.getParameter("fechaSoporte") != null) {
            r.setFechaSoporte(req.getParameter("fechaSoporte"));
        }
        if (req.getParameter("soporte") != null) {
            r.setSoporte(req.getParameter("soporte"));
        }
        try {
            rd.Actualizar(r);
            System.out.println("Registro actualizado correctamente");
            soporteList(req, resp);
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
        }
    }
}
