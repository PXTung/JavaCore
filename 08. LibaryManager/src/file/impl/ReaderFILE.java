package file.impl;

import file.IReaderFILE;
import model.PersonModel;
import model.ReaderModel;

import java.util.Scanner;

public class ReaderFILE implements IReaderFILE {
    private static ReaderFILE instance;

    public static ReaderFILE getInstance(){
        instance = new ReaderFILE();
        return instance;
    }

    @Override
    public ReaderModel getReaderFromFile(String fileName) {
        ReaderModel readerModel = new ReaderModel();

        Scanner scanner = ConnectionFILE.getInstance().openFileToRead(fileName);
        while (scanner.hasNext()){
            String datas = scanner.nextLine();
            String[] data = datas.split("\\|");
            readerModel = new ReaderModel(data[0], data[1], data[2], data[3]);
        }
        return readerModel;
    }
}
