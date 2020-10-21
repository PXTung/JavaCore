package file.impl;

import file.IPersonFILE;
import model.PersonModel;
import model.ReaderModel;

import java.util.Scanner;

public class PersonFILE implements IPersonFILE {

    private static PersonFILE instance;

    public static PersonFILE getInstance(){
        instance = new PersonFILE();
        return instance;
    }

    @Override
    public PersonModel getPersonFromFile(String fileName) {
        PersonModel personModel = new PersonModel();

        Scanner scanner = ConnectionFILE.getInstance().openFileToRead(fileName);
        while (scanner.hasNext()){
            String datas = scanner.nextLine();
            String[] data = datas.split("\\|");
            personModel =
                    new PersonModel(data[0], data[1], data[2], data[3], data[4]);
        }
        return personModel;
    }
}
