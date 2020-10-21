package file.impl;

import file.IConnectionFILE;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ConnectionFILE implements IConnectionFILE {
    private Scanner scanner;

    private static ConnectionFILE instance;

    public static ConnectionFILE getInstance(){
        instance = new ConnectionFILE();
        return instance;
    }

    @Override
    public Scanner openFileToRead(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return scanner;
    }
}
