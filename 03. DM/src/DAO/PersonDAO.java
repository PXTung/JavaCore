package DAO;

import m_interface.DAO;
import module.DBConnection;
import module.Person;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO implements DAO<Person> {
    @Override
    public void add(Person person) {
        var connection =
                DBConnection.getInstance().getSQLConnection();
        try {
            var statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO PERSON " +
                    "VALUES ('" + person.getPerId()
                    + "', '" + person.getFullName()
                    + "', '" + person.getAddress()
                    + "', '" + person.getDob()
                    + "', '" + person.getSex()
                    + "')"
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void edit(String id) {

    }

    @Override
    public void remove(String id) {
        var connection =
                DBConnection.getInstance().getSQLConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM PERSON " +
                    "WHERE PERSONID = '" + id + "'"
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void find(String string) {

    }

    @Override
    public <O> void show(ArrayList<O> objects) {
        for (var o : objects){
            System.out.println(o);
        }
    }

    public Person getPersonFromSQL(String perId){
        var connection =
                DBConnection.getInstance().getSQLConnection();
        try {
            var statement = connection.createStatement();
            var resultSet =
                    statement.executeQuery("SELECT * FROM PERSON "
                            + "WHERE PERSONID = '" + perId + "'");

            resultSet.next();
            var fullName = resultSet.getString("NAME");
            var address = resultSet.getString("ADDRESS");
            var dob = resultSet.getString("DOB");
            var sex = resultSet.getString("SEX");

            return new Person(perId, fullName, address, dob, sex);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return null;
    }
}
