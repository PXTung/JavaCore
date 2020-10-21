package controller;

import java.sql.Connection;

public class DBConnection {
    private static DBConnection instance = new DBConnection();

    public DBConnection(){

    }

    public static DBConnection getInstance(){
        return instance;
    }

    public Connection getSQLConnection(){
        return null;
    }
}
