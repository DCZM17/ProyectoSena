package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.login.loginVo;
import model.login.loginDao;

public class login extends HttpServlet {

    public login() {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String correoUsuario = req.getParameter("correoUsuario");
    String contrasena = req.getParameter("contrasena");
 
    loginVo loginVo = new loginVo();
 
    loginVo.setCorreoUsuario(correoUsuario);
    loginVo.setContrasenaUsuario(contrasena);
 
    loginDao loginDao = new loginDao();
 
    try
    {
        String userValidate = loginDao.authenticateUser(loginVo);
 
        if(userValidate.equals("Jefe_Rol"))
        {
            System.out.println("Bienvenido Jefe");
 
            HttpSession session = req.getSession(); //Creating a session
            session.setAttribute("Jefe", correoUsuario); //setting session attribute
            req.setAttribute("correoUsuario", correoUsuario);
 
            req.getRequestDispatcher("views/menus/menuJefe.jsp").forward(req, resp);
        }
        else if(userValidate.equals("Supervisor_Rol"))
        {
            System.out.println("Bienvenido Supervisor");
 
            HttpSession session = req.getSession();
            session.setAttribute("Supervisor", correoUsuario);
            req.setAttribute("correoUsuario", correoUsuario);
 
            req.getRequestDispatcher("views/menus/menuSupervisor.jsp").forward(req, resp);
        }
        else if(userValidate.equals("Conductor_Rol"))
        {
            System.out.println("Bienvenido Conductor");
 
            HttpSession session = req.getSession();
            session.setAttribute("Conductor", correoUsuario);
            req.setAttribute("correoUsuario", correoUsuario);
 
            req.getRequestDispatcher("views/menus/menuConductor.jsp").forward(req, resp);
        }
        else if(userValidate.equals("Montacarga_Rol"))
        {
            System.out.println("Bienvenido Montacraga");
 
            HttpSession session = req.getSession();
            session.setMaxInactiveInterval(10*60);
            session.setAttribute("Montacarga", correoUsuario);
            req.setAttribute("correoUsuario", correoUsuario);
 
            req.getRequestDispatcher("views/menus/menuMontacarga.jsp").forward(req, resp);
        }
        else
        {
            System.out.println("Error message = "+userValidate);
            req.setAttribute("errMessage", userValidate);
 
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
    catch (IOException e1)
    {
        e1.printStackTrace();
    }
    catch (Exception e2)
    {
        e2.printStackTrace();
    }
} //End of doPost()
}

