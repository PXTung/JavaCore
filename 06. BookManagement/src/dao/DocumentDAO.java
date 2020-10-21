package dao;

import controller.DBConnection;
import m_Interface.DAO;
import model.Document;

import java.sql.*;
import java.util.List;

public class DocumentDAO implements DAO<Document> {
    @Override
    public int addNew(Document document) {
        Connection connection = DBConnection.getInstance().getConnection();

        try{
            String sql = "INSERT INTO DOCUMENT(NAME, AUTHOR, YEAR, QUANTITY) "
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.
                    prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, document.getDocName());
            statement.setString(2, document.getDocAuthor());
            statement.setInt(3, document.getDocPYear());
            statement.setInt(4, document.getDocQuantity());
            statement.executeUpdate();

            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                return resultSet.getInt(1);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public List<Document> getAll() {
        return null;
    }

    @Override
    public void showInfo(List<Document> list) {

    }

    public Document getDocument(int docId){
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            String sql = "SELECT * FROM DOCUMENT WHERE ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, docId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                Document document = new Document();
                document.setDocName(resultSet.getString("NAME"));
                document.setDocAuthor(resultSet.getString("AUTHOR"));
                document.setDocPYear(resultSet.getInt("YEAR"));
                document.setDocQuantity(resultSet.getInt("QUANTITY"));
                return document;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
