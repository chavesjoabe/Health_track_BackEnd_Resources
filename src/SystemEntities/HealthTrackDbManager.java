package SystemEntities;
import java.sql.*;
public class HealthTrackDbManager {

    public static Connection getConnection(){
        Connection connection = null;
        try{
            String path = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(path, "RM82046", "210201");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return  connection;
    }

}
