package repository.util;

import java.sql.*;

/**
 * Created by developer on 02/11/2016.
 */
public class DbConnector implements AutoCloseable {
    private final static String URL="jdbc:mysql://localhost:3306/devgraph";
    private final static String PASSWORD="root";
    private final static String LOGIN="root";
    private final static  String DRIVER="com.mysql.cj.jdbc.Driver";
    private Connection connection;
    public DbConnector() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
       try{
           Connection connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
       }
       catch (SQLException e){
           System.out.print("chem karum kpnem db-in");
       }
    }
    public Connection getConnection(){
        return connection;
    }
    public PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return connection.prepareStatement(sql);
    }

    @Override
    public void close() throws Exception {

    }
}
