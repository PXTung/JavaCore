package DAO;

import controller.ReaderCtr;
import module.DBConnection;
import module.Person;
import module.Reader;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ReaderDAO extends PersonDAO {
    @Override
    public void add(Person person) {
        super.add(person);
        Reader reader = (Reader) person;
        var connection =
                DBConnection.getInstance().getSQLConnection();
        try {
            var statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO READER " +
                    "VALUES ('" + reader.getReaderId()
                    + "', '" + reader.getReaderType()
                    + "', '" + reader.getPhone()
                    + "', '" + reader.getEmail()
                    + "', '" + reader.getPerId()
                    + "')"
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(String id) {
        var connection =
                DBConnection.getInstance().getSQLConnection();


        String perId;

        var reader = (Reader)ReaderCtr.getInstance().addFromKeyBoard();
        try {
            var statement = connection.createStatement();
            var resulSet =
                    statement.executeQuery("SELECT * FROM READER " +
                            "WHERE READERID = '" + id + "'");
            resulSet.next();
            perId = resulSet.getString("PERSONID");

            statement.executeUpdate("DELETE FROM READER " +
                    "WHERE READERID = '" + id + "'"
            );

            statement.executeUpdate("UPDATE PERSON "
                    + "SET PERSONID = '" + reader.getPerId()
                    + "', NAME = '" + reader.getFullName()
                    + "', ADDRESS = '" + reader.getAddress()
                    + "', DOB = '" + reader.getDob()
                    + "', SEX = '" + reader.getSex()
                    + "' WHERE PERSONID = '" + perId + "'"
            );

            statement.executeUpdate("INSERT INTO READER " +
                    "VALUES ('" + reader.getReaderId()
                    + "', '" + reader.getReaderType()
                    + "', '" + reader.getPhone()
                    + "', '" + reader.getEmail()
                    + "', '" + reader.getPerId()
                    + "')"
            );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(String id) {
        var connection =
                DBConnection.getInstance().getSQLConnection();
        String perId;

        try {
            var statement = connection.createStatement();
            var resulSet =
                    statement.executeQuery("SELECT * FROM READER " +
                            "WHERE READERID = '" + id + "'");
            resulSet.next();
            perId = resulSet.getString("PERSONID");

            statement.executeUpdate("DELETE FROM READER " +
                    "WHERE READERID = '" + id + "'"
            );

            super.remove(perId);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void find(String string) {
        var readers = getListReader();
        var result = new ArrayList<Reader>();
        for (var r : readers){
            var matcher =
                    Pattern.compile(string.toLowerCase()).
                            matcher(r.getFullName().toLowerCase());
            if (matcher.find())
                result.add(r);
        }
        for (var r : result)
            System.out.println(r);
    }

    @Override
    public <O> void show(ArrayList<O> o) {
        super.show(o);
    }

    public ArrayList<Reader> getListReader() {
        var connection =
                DBConnection.getInstance().getSQLConnection();
        var readers = new ArrayList<Reader>();
        try {
            var statement = connection.createStatement();
            var resultSet =
                    statement.executeQuery("SELECT * FROM READER");
            while(resultSet.next()){
                var readerId = resultSet.getString("READERID");
                var type = resultSet.getString("TYPE");
                var phone = resultSet.getString("PHONE");
                var email = resultSet.getString("EMAIL");
                var perId = resultSet.getString("PERSONID");

                var person = getPersonFromSQL(perId);
                var reader = new Reader(person, readerId, type, phone, email);

                readers.add(reader);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return readers;
    }
}
