package module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static DBConnection instance = new DBConnection();

    public DBConnection() {

    }

    public static DBConnection getInstance(){
        return instance;
    }

    public Connection getSQLConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            var url = "jdbc:sqlserver://localhost:1433; databaseName = DM";
            var user = "sa";
            var pass = "Tungtung96";

            Connection connection =
                    DriverManager.getConnection(url, user, pass);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
