package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public DBConnection() {
    }

    public static DBConnection getInstance(){
        return new DBConnection();
    }

    public Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            final String url = "jdbc:sqlserver://localhost:1433; databaseName=BOOK";
            final String user = "sa";
            final String pass = "Tungtung96";
            Connection connection = DriverManager.getConnection(url, user, pass);
            if (connection != null)
                return connection;
            else
                System.out.println("CONNECTION TO SQL ERROR");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
