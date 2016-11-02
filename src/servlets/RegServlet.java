package servlets;

import graph.model.User;
import repository.implement.UserRepository;
import repository.util.DbConnector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by developer on 31/10/2016.
 */
public class RegServlet extends HttpServlet {
    public RegServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Hello World");
        System.out.print("hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Random rnd=new Random();
       User newUser=new User(rnd.nextLong(),req.getParameter("firstname"),req.getParameter("lastname"),req.getParameter("birdtDate"),req.getParameter("gender"),req.getParameter("country"),req.getParameter("sity"),req.getParameter("mail"),req.getParameter("password"));
        UserRepository userRepository=new UserRepository();
        try {
            if(!userRepository.existUser(newUser)){
                out.println("tvyalner@ goyutyn unen");
                resp.sendRedirect("register.jsp");
            }
            else{
                out.println(newUser.getBirdtDate());
                out.println(newUser.getLastName());
                out.println(newUser.getFirstName());
                out.println(newUser.getMail());
                out.println(newUser.getGender());
                userRepository.addUser(newUser);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
