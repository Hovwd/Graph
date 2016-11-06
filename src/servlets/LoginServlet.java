package servlets;

import graph.model.User;
import repository.implement.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by developer on 03/11/2016.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out =response.getWriter();
        out.print("<h1>hello world<h1/>");
        UserRepository userRepository=new UserRepository();
        User user=null;
        try {
            user=userRepository.GetUser(request.getParameter("mail"),request.getParameter("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        out.print(user);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
