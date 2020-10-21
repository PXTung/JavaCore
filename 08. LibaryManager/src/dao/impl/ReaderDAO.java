package dao.impl;

import dao.IReaderDAO;
import mapper.ReaderMapper;
import model.ReaderModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ReaderDAO extends AbstractDAO<ReaderModel> implements IReaderDAO {

    @Override
    public ReaderModel save(ReaderModel reader) {
        StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append("reader(redid, redtype, rednumber, redemail, perid) ");
        sql.append("VALUES(?, ?, ?, ?, ?)");
        insert(sql.toString(), reader.getRedId(), reader.getRedType(),
            reader.getRedNumber(), reader.getRedEmail(), reader.getPerId());
        return reader;
    }

    @Override
    public List<ReaderModel> findAll() {
        String sql = "SELECT * FROM reader";
        List<ReaderModel> readers = query(sql, new ReaderMapper());
        return readers;
    }
}