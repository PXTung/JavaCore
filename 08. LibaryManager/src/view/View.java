package view;

import model.PersonModel;
import model.ReaderModel;

import java.util.List;
import java.util.Scanner;

public class View {
    private static View instance;

    public static View getInstance(){
        instance = new View();
        return instance;
    }

    public int menu(Scanner sc){
        int menu;
        System.out.println("--------------MENU--------------");
        System.out.println("1. PERSON");
        System.out.println("2. DOCUMENT");
        System.out.println("3. MANAGEMENT");
        System.out.println("0. CLOSE");
        menu = sc.nextInt();
        sc.nextLine();
        return menu;
    }

    public int person(Scanner sc){
        int person;
        System.out.println("-------------PERSON-------------");
        System.out.println("1. READER");
        System.out.println("2. EMPLOYEE");
        System.out.println("0. BACK");
        person = sc.nextInt();
        sc.nextLine();
        return person;
    }

    public int personOf(Scanner sc, String name){
        int tmp;
        System.out.println("-------------PERSON-------------");
        System.out.println("1. ADD " + name);
        System.out.println("2. SHOW LIST " + name);
        System.out.println("3. EDIT " + name);
        System.out.println("4. DELETE " + name);
        System.out.println("5. FIND " + name);
        System.out.println("0. BACK");
        tmp = sc.nextInt();
        sc.nextLine();
        return tmp;
    }

    public PersonModel addPerson(Scanner sc) {
        System.out.println("-----------ADD PERSON-----------");
        System.out.println("PERSON ID: ");
        String perId = sc.nextLine();

        System.out.println("PERSON FULL NAME");
        String perName = sc.nextLine();

        System.out.println("PERSON ADDRESS");
        String perAddress = sc.nextLine();

        System.out.println("PERSON DATE OF BIRTH");
        String perDob = sc.nextLine();

        System.out.println("PERSON GENDER");
        String perGender = sc.nextLine();

        return new PersonModel(perId, perName, perAddress, perDob, perGender);
    }

    public ReaderModel addReader(Scanner sc) {
        String redId, redNumber, redEmail;
        int type;
        String redType[] = {"STUDENT", "TEACHER", "OFFICER", "OLDER"};

        System.out.println("-----------ADD READER-----------");
        System.out.println("READER ID: ");
        redId = sc.nextLine();

        do{
            System.out.println("READER TYPE: ");
            System.out.println("1. STUDENT \n2. TEACHER \n3. OFFICER \n4. OLDER");
            type = sc.nextInt();
            sc.nextLine();
        }while (type < 1 || type > 4);

        System.out.println("READER NUMBER: ");
        redNumber = sc.nextLine();

        System.out.println("READER EMAIL");
        redEmail = sc.nextLine();

        return new ReaderModel(redId, redType[type - 1], redNumber, redEmail);
    }

    public void show(Object object) {
        System.out.println(object);
    }

    public void showList(List<ReaderModel> readers) {
        for (ReaderModel r : readers)
            System.out.println(r);
    }
}
