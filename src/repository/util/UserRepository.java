package repository.util;

import graph.model.User;

import java.beans.Statement;
import java.sql.*;

/**
 * Created by developer on 31/10/2016.
 */
public class UserRepository {
    private final static String URL="jdbc:mysql://localhost:3306/devgraph";
    private final static String PASSWORD="root";
    private final static String LOGIN="root";
  public  User addUser(User newUser){
      User user;
      PreparedStatement ps=null;
      try{       Connection connection =  DriverManager.getConnection(URL, PASSWORD, LOGIN);
    String sql= "INSERT INTO user (id,firstName,lastName,gender,birdtDate,country,sity,mail,pasword) VALUES (?,?,?,?,?,?,?,?,?);";
    ps= connection.prepareStatement(sql);}catch (Exception e){System.out.print("can non to connect mysql");}
      try {
          ps.setLong(1, newUser.getId());
          ps.setString(2, newUser.getFirstName());
          ps.setString(3, newUser.getLastName());
          ps.setString(4, newUser.getGender());
          ps.setDate(5, (Date) newUser.getBirdtDate());
          ps.setString(6, newUser.getCountry());
          ps.setString(7, newUser.getSity());
          ps.setString(8,newUser.getMail());
          ps.setString(9, newUser.getPassword());
          ps.execute();
      }
      catch (Exception e){
            System.out.print("chem karum insert anem");
      }
      finally {
      }


      return newUser;
    }
   public boolean existUser(String password,String Url){
        return false;
    }
    public boolean delletUser(long id){
        return  false;
    }
    public boolean editUser(){
       return false;
    }
}
