package controller;

import file.impl.PersonFILE;
import file.impl.ReaderFILE;
import model.PersonModel;
import model.ReaderModel;
import service.IPersonService;
import service.IReaderService;
import service.impl.PersonService;
import service.impl.ReaderService;
import view.View;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private static Controller instance;

    public static Controller getInstance(){
        instance = new Controller();
        return instance;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int menuCase;
        do{
            menuCase = View.getInstance().menu(sc);
            switch (menuCase){
                case 1:
                    person();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 0:
                    break;
            }
        }while (menuCase != 0);
    }

    private void person() {
        Scanner sc = new Scanner(System.in);
        int personCase;
        do{
            personCase = View.getInstance().person(sc);
            switch (personCase){
                case 0:
                    break;

                case 1:
                    reader();
                    break;
            }
        }while (personCase != 0);
    }

    private void reader() {
        Scanner sc = new Scanner(System.in);

        IReaderService readerService = new ReaderService();
        IPersonService personService = new PersonService();

        int readerCase;
        do {
            readerCase = View.getInstance().personOf(sc, "READER");
            switch (readerCase){
                case 0:
                    break;

                case 1:
                    ReaderModel reader = ReaderFILE.getInstance().
                            getReaderFromFile("READER.DAT");
                    PersonModel person = PersonFILE.getInstance().
                            getPersonFromFile("PERSON.DAT");
                    person = personService.save(person);
                    reader.setPerId(person.getPerId());
                    reader = readerService.save(reader);
                    View.getInstance().show(reader);
                    break;

                case 2:
                    List<ReaderModel> readers = readerService.findAll();
                    View.getInstance().showList(readers);
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;
            }
        }while (readerCase != 0);
    }
}
