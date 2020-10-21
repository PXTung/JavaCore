package dao.impl;

import dao.GenericDAO;
import mapper.IMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;

public class AbstractDAO<T> implements GenericDAO<T> {

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "Tungtung96";

            Connection connection =
                    DriverManager.getConnection(url, user, pass);
            if (connection != null)
                return connection;
            else
                System.out.println("DB CONNECTION FAIL");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (MissingResourceException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<T> query(String sql, IMapper<T> mapper, Object... parameters) {
        List<T> list = new ArrayList<>();
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement = setStatement(statement, parameters);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(mapper.rowMapper(resultSet));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public void insert(String sql, Object... parameters) {
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement = setStatement(statement, parameters);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private PreparedStatement setStatement(
            PreparedStatement statement, Object... parameters) {
        try {
            for (int i = 0; i < parameters.length; i++) {
                if (parameters[i] instanceof String) {
                    statement.setString(i + 1, (String) parameters[i]);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return statement;
    }
}
