package servlets;

import graph.model.User;
import repository.util.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
        out.println("Hello World");
        Random rnd=new Random();
       User newUser=new User(rnd.nextLong(),req.getParameter("firstName"),req.getParameter("birdtDate"),req.getParameter("gender"),req.getParameter("country"),req.getParameter("sity"),req.getParameter("mail"),req.getParameter("password"));
        out.print(req.getParameter("birdtDate"));
        UserRepository userRepository =new UserRepository();
        User cuser = null;
        try {
          cuser=userRepository.addUser(newUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println(cuser.getPassword());

    }
}
