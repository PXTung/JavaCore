package file;

import model.PersonModel;
import model.ReaderModel;

public interface IReaderFILE {
    ReaderModel getReaderFromFile(String fileName);
}
