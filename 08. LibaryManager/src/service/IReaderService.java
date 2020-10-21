package service;

import model.ReaderModel;

import java.util.List;

public interface IReaderService {
    ReaderModel save(ReaderModel readerModel);
    List<ReaderModel> findAll();
}
