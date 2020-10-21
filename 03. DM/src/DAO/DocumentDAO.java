package DAO;

import m_interface.DAO;
import module.DBConnection;
import module.Document;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocumentDAO implements DAO<Document> {
    @Override
    public void add(Document document) {
        var connection =
                DBConnection.getInstance().getSQLConnection();
        try {
            var statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO DOCUMENT " +
                    "VALUES ('" + document.getDocName()
                    + "', '" + document.getAuthor()
                    + "', '" + document.getPublishYear()
                    + "', '" + document.getQuantity()
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
        try {
            var statement = connection.createStatement();
            statement.executeUpdate(
                    "DELETE FROM DOCUMENT WHERE NAME = '" + id + "'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void find(String string) {

    }

    @Override
    public <O> void show(ArrayList<O> object) {
        for (var o : object){
            System.out.println(o);
        }
    }

    public List<Document> getListDocument() {
        var connection =
                DBConnection.getInstance().getSQLConnection();
        var documents = new ArrayList<Document>();
        try {
            var statement = connection.createStatement();
            var resultSet =
                    statement.executeQuery("SELECT * FROM DOCUMENT");
            while (resultSet.next()){
                var docId = resultSet.getString("NAME");
                var author = resultSet.getString("AUTHOR");
                var publish = resultSet.getInt("PUBLISH");
                var quantity = resultSet.getInt("QUANTITY");

                Document document =
                        new Document(docId, author, publish, quantity);
                documents.add(document);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return documents;
    }

    public Document getDocument(String docName) {
        var documents = getListDocument();
        for (var d : documents){
            if (d.getDocName().compareTo(docName) == 0){
                return d;
            }
        }
        return null;
    }
}
