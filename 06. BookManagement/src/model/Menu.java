package model;

import java.util.Scanner;

public class Menu {

    public void mainMenu(){
        System.out.println("----------BOOK MANAGEMENT----------");
        System.out.println("1. DOCUMENT");
        System.out.println("2. PERSON");
        System.out.println("3. MANAGEMENT");
        System.out.println("0. EXIT");
    }

    public void docMenu(){
        System.out.println("-------------DOCUMENT--------------");
        System.out.println("1. TO ADD NEW BOOK");
        System.out.println("2. TO SHOW LIST BOOK");
        System.out.println("3. TO EDIT BOOK");
        System.out.println("0. EXIT");
    }

    public void perMenu() {
        System.out.println("--------------PERSON---------------");
        System.out.println("1. READER");
        System.out.println("2. EMPLOYEE");
        System.out.println("0. EXIT");
    }

    public void menuOf(String object) {
        System.out.println("--------------" + object.toUpperCase() + "---------------");
        System.out.println("1. TO ADD NEW " + object.toUpperCase());
        System.out.println("2. TO SHOW LIST " + object.toUpperCase());
        System.out.println("3. TO EDIT " + object.toUpperCase());
        System.out.println("0. EXIT");
    }
}
