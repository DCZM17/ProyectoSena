package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.login.loginVo;
import model.login.loginDao;

import model.empleado.empleadoVo;
import model.empleado.empleadoDao;

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
        
        String[] datosObtenidos = userValidate.split(",");
            
            System.out.println("mostrarte "+datosObtenidos[1]);
 
        if(datosObtenidos[2].equals("Jefe"))
        {
            System.out.println("Bienvenido Jefe");
            
         
            HttpSession session = req.getSession(); //Creating a session
            session.setAttribute("idUsuario", datosObtenidos[0]); //dnvia la varibale de la consulta a la vista por sesion
            session.setAttribute("nombreUsuario", datosObtenidos[3]);
            session.setAttribute("apellidoUsuario", datosObtenidos[4]);
            session.setAttribute("rolUsuario", datosObtenidos[2]);
            //req.setAttribute("correoUsuario", datosObtenidos[1]);
            
            
 
            req.getRequestDispatcher("views/menus/menuJefe.jsp").forward(req, resp);
        }
        else if(datosObtenidos[2].equals("Supervisor")){
            
            System.out.println("Bienvenido Supervisor");
 
            HttpSession session = req.getSession(); //Creating a session
            session.setAttribute("idUsuario", datosObtenidos[0]); //dnvia la varibale de la consulta a la vista por sesion
            session.setAttribute("nombreUsuario", datosObtenidos[3]);
            session.setAttribute("apellidoUsuario", datosObtenidos[4]);
            session.setAttribute("rolUsuario", datosObtenidos[2]);
 
            req.getRequestDispatcher("views/menus/menuSupervisor.jsp").forward(req, resp);
        }
        else if(datosObtenidos[2].equals("Conductor"))
        {
            System.out.println("Bienvenido Conductor");
 
             HttpSession session = req.getSession(); //Creating a session
            session.setAttribute("idUsuario", datosObtenidos[0]); //dnvia la varibale de la consulta a la vista por sesion
            session.setAttribute("nombreUsuario", datosObtenidos[3]);
            session.setAttribute("apellidoUsuario", datosObtenidos[4]);
            session.setAttribute("rolUsuario", datosObtenidos[2]);
            
            req.getRequestDispatcher("views/menus/menuConductor.jsp").forward(req, resp);
        }
        else if(datosObtenidos[2].equals("Montacarga"))
        {
            System.out.println("Bienvenido Montacarga");
 
             HttpSession session = req.getSession(); //Creating a session
            session.setAttribute("idUsuario", datosObtenidos[0]); //dnvia la varibale de la consulta a la vista por sesion
            session.setAttribute("nombreUsuario", datosObtenidos[3]);
            session.setAttribute("apellidoUsuario", datosObtenidos[4]);
            session.setAttribute("rolUsuario", datosObtenidos[2]);
            
            req.getRequestDispatcher("views/menus/menuMontacarga.jsp").forward(req, resp);
        }
        else
        {
            System.out.println("Error message = "+userValidate);
            req.setAttribute("errMessage", userValidate);
            System.out.println("Error message = "+userValidate);
            
            
            
 
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

