package dao;

import controller.DBConnection;

import java.util.regex.Pattern;

public class BookDAO extends DocumentDAO {
    @Override
    public <Book> void add(Book book) {
        var connection =
                DBConnection.getInstance().getSQLConnection();
        var matcher = Pattern.compile("aa").matcher("bb");
        matcher.find();
        
    }
}
