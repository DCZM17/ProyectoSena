package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.horarioRegistrado.horarioReDao;
import model.horarioRegistrado.horarioReVo;

public class horarioReController extends HttpServlet {
    horarioReVo r = new horarioReVo();
    horarioReDao rd = new horarioReDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("estas en el DoGet");
        String accion = req.getParameter("accion");

        switch (accion) {
            case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                break;

            case "gestionar":
                listar(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPosts");
        String accion = req.getParameter("accion");
        System.out.println("Se hara la funcion de " + accion);
        switch (accion) {
            case "add":
                add(req, resp);
                break;
            case "add_almuerzo":
                add_almuerzo(req, resp);
                break;
            case "add_almuerzo_entrada":
                add_almuerzo_entrada(req, resp);
                break;
            case "add_salida":
                add_salida(req, resp);
                break;
            /*
             * case "listar":
             * tabla1(req,resp);
             * break;
             */
        }
    }

    // LISTAR
    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List horarioRList = rd.listar();
            req.setAttribute("listar", horarioRList);
            req.getRequestDispatcher("views/horarioRegistrado/horarioRegistradoList.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos " + e.getMessage().toString());
        }
    }

    /*
     * private void tabla1 (HttpServletRequest req, HttpServletResponse resp) {
     * try {
     * List horarioRList=rd.listar();
     * req.setAttribute("listar", horarioRList);
     * 
     * System.out.println("Datos listados correctamente");
     * 
     * } catch (Exception e) {
     * System.out.println("Hay problemas al listar los datos "+e.getMessage().
     * toString());
     * }
     * }
     */

    // AGREGAR
    private void add(HttpServletRequest req, HttpServletResponse resp) {

        if (req.getParameter("fecha_actual") != null) {
            r.setHoraEntradaRegistrada(req.getParameter("fecha_actual"));
        } else {
            System.out.println("No entre");
        }
        try {
            rd.add(r);
            System.out.println("Registro insertado correctamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
        }
    }

    // AGREGAR HORA SALIDA ALMUERZO

    private void add_almuerzo(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("id") != null) {
            r.setIdHorarioRegistrado(Integer.parseInt(req.getParameter("id")));// Cambiar de string a int
        }
        if (req.getParameter("fecha_actual") != null) {
            r.setHoraInicioAlmuerzo(req.getParameter("fecha_actual"));// Cambiar de string a int
        }
        try {
            rd.actualizar_almuerzo(r);
            System.out.println("Se agrego la hora de salida del almuerzo correctamente");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Error al editar del registro " + e.getMessage().toString());
        }
    }

    // HORA ENTRADA ALMUERZO
    private void add_almuerzo_entrada(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("id") != null) {
            r.setIdHorarioRegistrado(Integer.parseInt(req.getParameter("id")));// Cambiar de string a int
        }
        if (req.getParameter("fecha_actual") != null) {
            r.setHoraFinAlmuerzo(req.getParameter("fecha_actual"));// Cambiar de string a int
        }
        try {
            rd.actualizar_almuerzo_entrada(r);
            System.out.println("Se agrego la hora de entrada del almuerzo correctamente");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Error al editar del registro " + e.getMessage().toString());
        }
    }

    // SALIDA
    private void add_salida(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("id") != null) {
            r.setIdHorarioRegistrado(Integer.parseInt(req.getParameter("id")));// Cambiar de string a int
        }
        if (req.getParameter("fecha_actual") != null) {
            r.setHoraSalidaRegistrada(req.getParameter("fecha_actual"));// Cambiar de string a int
        }
        try {
            rd.add_salida(r);
            System.out.println("Se agrego la hora de salida correctamente");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Error al editar del registro " + e.getMessage().toString());
        }

    }

}

//destroy session in java
