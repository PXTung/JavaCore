package DAO;

import controller.BookCtr;
import module.Book;
import module.DBConnection;
import module.Document;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class BookDAO extends DocumentDAO {
    @Override
    public void add(Document document) {
        super.add(document);
        Book book = (Book) document;
        try {
            var connection =
                    DBConnection.getInstance().getSQLConnection();
            var statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO BOOK " +
                    "VALUES ('" + book.getBookId()
                    + "', '" + book.getType()
                    + "', '" + book.getDocName()
                    + "')"
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(String id) {
        var bookCtr = new BookCtr();
        var connection =
                DBConnection.getInstance().getSQLConnection();

        String docName;

        try {
            var statement = connection.createStatement();
            var result =
                    statement.executeQuery("SELECT DOCUMENT " +
                                        "FROM BOOK " +
                                        "WHERE BOOKID = '" + id + "'");

            if (result.next()){
                docName = result.getString("DOCUMENT");

                var book = bookCtr.addFromKeyBoard();

                statement.executeUpdate("DELETE FROM BOOK " +
                        "WHERE BOOKID = '" + id + "'");

                statement.executeUpdate("UPDATE DOCUMENT " +
                        "SET NAME = '" + book.getDocName()
                        + "', AUTHOR = '" + book.getAuthor()
                        + "', PUBLISH = '" + book.getPublishYear()
                        + "', QUANTITY = '" + book.getQuantity()
                        + "' WHERE NAME = '" + docName + "'"
                );

                statement.executeUpdate("INSERT INTO BOOK " +
                        "VALUES ('" + book.getBookId()
                        + "', '" + book.getType()
                        + "', '" + book.getDocName()
                        + "')"
                );
            }else {
                System.out.println("BOOK ID IS INVALID");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(String id) {
        var connection =
                DBConnection.getInstance().getSQLConnection();
        String docName;

        try {
            var statement = connection.createStatement();

            var result = statement.executeQuery(
                    "SELECT * FROM BOOK WHERE BOOKID = '" + id + "'");
            result.next();
            docName = result.getString("DOCUMENT");

            statement.executeUpdate(
                    "DELETE FROM BOOK WHERE BOOKID = '" + id + "'");

            super.remove(docName);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void find(String name) {
        var books = getListBook();
        var result = new ArrayList<Book>();
        for(var b : books){
            var matcher =
                    Pattern.compile(name.toLowerCase()).
                            matcher(b.getDocName().toLowerCase());
            if (matcher.find())
                result.add(b);
        }

        for (var r : result){
            System.out.println(r);
        }
    }

    @Override
    public <O> void show(ArrayList<O> objects) {
        super.show(objects);
    }

    public ArrayList<Book> getListBook(){
        var connection =
                DBConnection.getInstance().getSQLConnection();
        var books = new ArrayList<Book>();
        try {
            var statement = connection.createStatement();
            var resulSet =
                    statement.executeQuery("SELECT * FROM BOOK");
            while (resulSet.next()){
                var bookId = resulSet.getString("BOOKID");
                var type = resulSet.getString("TYPE");
                var docName = resulSet.getString("DOCUMENT");
                Document document = getDocument(docName);
                Book book = new Book(document, bookId, type);
                books.add(book);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return books;
    }
}
