package controller;

import m_interface.Ctr;
import module.Person;

import java.util.Scanner;

public class PersonCtr implements Ctr<Person> {

    @Override
    public Person addFromKeyBoard() {
        var sc = new Scanner(System.in);

        String perId, fullName, address, dob, sex;

        System.out.println("PERSON IDENTIFY: ");
        perId = sc.nextLine();

        System.out.println("PERSON FULL NAME: ");
        fullName = sc.nextLine();

        System.out.println("PERSON ADDRESS: ");
        address = sc.nextLine();

        System.out.println("PERSON DATE OF BIRTH: ");
        dob = sc.nextLine();

        System.out.println("PERSON SEX: ");
        sex = sc.nextLine();

        return new Person(perId, fullName, address, dob, sex);
    }
}
