/**
 * Created by developer on 30/10/2016.
 */

package repository.util;


        import java.sql.*;

public class DbConnector {
    private final static String URL="jdbc:mysql://localhost:3306/devgraph";
    private final static String PASSWORD="root";
    private final static String LOGIN="root";
    private Connection connection;
    private Statement statement;
    public DbConnector()
    {
        try {
            connection =  DriverManager.getConnection(URL, PASSWORD, LOGIN);
        }catch (Exception e){System.out.print("es inj axmaxutyuna");}

        try {

            statement = (Statement) connection.createStatement();

        }
        catch (SQLException e){
            System.out.print("error connect db");
        }
    }
    public Statement getStatement(){
        return (Statement)statement;
    }

    public Connection getConnection() {
        return connection;
    }

    public void close(){
        try {
            connection.close();
            statement.close();
        }
        catch (SQLException e){
            System.out.print("error connect db");
        }
    }


}