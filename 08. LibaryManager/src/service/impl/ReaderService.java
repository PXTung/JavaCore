package service.impl;

import dao.IReaderDAO;
import dao.impl.ReaderDAO;
import model.ReaderModel;
import service.IReaderService;

import java.util.List;

public class ReaderService implements IReaderService {
    IReaderDAO readerDAO = new ReaderDAO();

    @Override
    public ReaderModel save(ReaderModel readerModel) {
        return readerDAO.save(readerModel);
    }

    @Override
    public List<ReaderModel> findAll() {
        return readerDAO.findAll();
    }
}
