package controller;

import module.Person;
import module.Reader;

import java.util.Scanner;

public class ReaderCtr extends PersonCtr{
    static ReaderCtr instance = new ReaderCtr();

    public ReaderCtr() {

    }

    public static ReaderCtr getInstance(){
        return instance;
    }

    @Override
    public Person addFromKeyBoard() {
        var sc = new Scanner(System.in);
        var person = super.addFromKeyBoard();

        String readerId, phone, email;
        int typeCase;
        String[] type = {"TEACHER", "STUDENT", "CHILDREN", "OFFICER", "OLDER"};

        System.out.println("READER ID: ");
        readerId = sc.nextLine();

        System.out.println("READER TYPE: ");
        System.out.println("1. TEACHER \n2. STUDENT \n3. OFFICER" +
                "\n4. CHILDREN \n5. OLDER");
        typeCase = sc.nextInt();
        sc.nextLine();

        System.out.println("READER PHONE: ");
        phone = sc.nextLine();

        System.out.println("READER EMAIL: ");
        email = sc.nextLine();

        return new Reader(person, readerId, type[typeCase - 1], phone, email);
    }
}
