package dao;

import controller.DBConnection;
import model.Book;
import model.Document;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends DocumentDAO{

    public static BookDAO getInstance(){
        return new BookDAO();
    }

    @Override
    public int addNew(Document document) {
        Book book = (Book) document;
        Connection connection = DBConnection.getInstance().getConnection();

        int docId = super.addNew(book);
        if (docId != -1){
            try {
                String sql = "INSERT INTO BOOK(BOOKID, TYPE, DOCID) "
                        + "VALUES(?, ?, ?)";
                PreparedStatement statement = connection.
                        prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                statement.setString(1, book.getbId());
                statement.setString(2, book.getbType());
                statement.setInt(3, docId);
                statement.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }else
            System.out.println("ADD DOCUMENT ERROR");
        return -1;
    }

    @Override
    public List<Document> getAll() {
        List<Document> books = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM BOOK";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                String bId = resultSet.getString("BOOKID");
                String bType = resultSet.getString("TYPE");
                int docId = resultSet.getInt("DOCID");
                Document document = getDocument(docId);
                Book book = new Book(document, bId, bType);
                books.add(book);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void showInfo(List<Document> list) {
        for (Document l : list){
            System.out.println(l);
        }
    }
}
