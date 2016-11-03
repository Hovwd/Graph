package repository.implement;

import graph.model.User;
import repository.util.DbConnector;

import java.sql.*;
import java.util.Random;

/**
 * Created by developer on 02/11/2016.
 */
public class UserRepository {
    private final static String PASSWORD = "root";
    private final static String LOGIN = "root";
    String url = "jdbc:mysql://localhost:3306/devgraph";
    public User addUser(User user) throws Exception {
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, "root", "root");
        String sql = "insert into user(id,firstName,lastName,gender,country,sity,mail,password) VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        ps = connection.prepareStatement(sql);
        ps.setLong(1, new Random().nextLong());
        ps.setString(2, user.getFirstName());
        ps.setString(3, user.getLastName());
        ps.setString(4, user.getGender());
        ps.setString(5,user.getCountry());
        ps.setString(6,user.getSity());
        ps.setString(7, user.getMail());
        ps.setString(8,user.getPassword());
        ps.execute();
        connection.close();
        ps.close();
        return user;
    }
    public boolean existUser(User user)throws Exception{
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
           System.out.print("class not afound");
        }
        ResultSet result = null;
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            String sql = "SELECT COUNT(*)  FROM USER  WHERE mail=? or password=?;";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1,user.getMail());
            ps.setString(2, user.getPassword());
            result=ps.executeQuery();
        } catch (SQLException e) {
            System.out.print("can not to connect db");
        }
        result.next();
        return result.getInt(1)==0;
    }
    public boolean existUser(String mail,String password)throws Exception{
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.print("class not afound");
        }
        ResultSet result = null;
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            String sql = "SELECT COUNT(*)  FROM USER  WHERE mail=? or password=?;";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1,mail);
            ps.setString(2, password);
            result=ps.executeQuery();
        } catch (SQLException e) {
            System.out.print("can not to connect db");
        }
        result.next();
        return result.getInt(1)==0;
    }
    public User GetUser(String mail,String password) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.print("class not afound");
        }
        ResultSet result = null;
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            String sql = "SELECT *  FROM USER  WHERE mail=? and password=?;";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1,mail);
            ps.setString(2,password);
            result=ps.executeQuery();
        } catch (SQLException e) {
            System.out.print("can not to connect db");
        }
        try {
            result.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new User(result.getLong(1),result.getString(2),result.getString(3),result.getDate(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11));
    }
}
