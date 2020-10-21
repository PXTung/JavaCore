package dao;

import model.ReaderModel;

import java.util.List;

public interface IReaderDAO {
    ReaderModel save(ReaderModel readerModel);
    List<ReaderModel> findAll();
}
