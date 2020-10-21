package view;

import DAO.BookDAO;
import DAO.PersonDAO;
import DAO.ReaderDAO;
import controller.BookCtr;
import controller.ReaderCtr;
import module.Book;
import module.Reader;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var bookCtr = new BookCtr();
        var readerCtr = new ReaderCtr();

        var bookDAO = new BookDAO();
        var readerDAO = new ReaderDAO();

        var books = new ArrayList<Book>();
        var readers = new ArrayList<Reader>();

        int menuCase;
        do{
            showMenu();
            menuCase = sc.nextInt();
            sc.nextLine();
            switch (menuCase){
                case 0:
                    break;

                case 1:
                    int docMenu;
                    do {
                        System.out.println("----------DOCUMENT MENU-----------");
                        showMenuOf("BOOK");
                        docMenu = sc.nextInt();
                        sc.nextLine();

                        switch (docMenu){
                            case 0:
                                break;

                            case 1:
                                System.out.println("-----------ADD NEW BOOK-----------");
                                Book book = bookCtr.addFromKeyBoard();
                                bookDAO.add(book);
                                break;

                            case 2:
                                System.out.println("------------LIST BOOK-------------");
                                books = bookDAO.getListBook();
                                bookDAO.show(books);
                                break;

                            case 3:
                                String bookId;
                                System.out.println("------------EDIT BOOK-------------");
                                System.out.println("INPUT BOOK ID: ");
                                bookId = sc.nextLine();
                                bookDAO.edit(bookId);
                                break;

                            case 4:
                                System.out.println("-----------DELETE BOOK------------");
                                System.out.println("INPUT BOOK ID: ");
                                bookId = sc.nextLine();
                                bookDAO.remove(bookId);
                                break;

                            case 5:
                                String docName;
                                System.out.println("------------FIND BOOK-------------");
                                System.out.println("INPUT NAME: ");
                                docName = sc.nextLine();
                                bookDAO.find(docName);
                                break;
                        }
                    }while (docMenu != 0);
                    break;

                case 2:
                    int perMenu;
                    do{
                        showPersonMenu();
                        perMenu = sc.nextInt();
                        sc.nextLine();
                        switch (perMenu){
                            case 0:
                                break;

                            case 1:
                                int readMenu;
                                do{
                                    System.out.println("--------------READER--------------");
                                    showMenuOf("READER");
                                    readMenu = sc.nextInt();
                                    sc.nextLine();

                                    switch (readMenu){
                                        case 0:
                                            break;

                                        case 1:
                                            System.out.println("----------ADD NEW READER----------");
                                            var reader = readerCtr.addFromKeyBoard();
                                            readerDAO.add(reader);
                                            break;

                                        case 2:
                                            System.out.println("------------LIST READER-----------");
                                            readers = readerDAO.getListReader();
                                            readerDAO.show(readers);
                                            break;

                                        case 3:
                                            String readerId;
                                            System.out.println("------------EDIT READER-----------");
                                            System.out.println("READER ID");
                                            readerId = sc.nextLine();
                                            readerDAO.edit(readerId);
                                            break;

                                        case 4:
                                            System.out.println("-----------REMOVE READER----------");
                                            System.out.println("READER ID");
                                            readerId = sc.nextLine();
                                            readerDAO.remove(readerId);
                                            break;

                                        case 5:
                                            String name;
                                            System.out.println("------------FIND READER-----------");
                                            System.out.println("READER NAME");
                                            name = sc.nextLine();
                                            readerDAO.find(name);
                                            break;
                                    }
                                }while (readMenu != 0);
                                break;

                            case 2:
                                int empMenu;
                                do{
                                    System.out.println("-------------EMPLOYEE-------------");
                                    showMenuOf("EMPLOYEE");
                                    empMenu = sc.nextInt();
                                    sc.nextLine();

                                    switch (empMenu){
                                        case 0:
                                            break;

                                        case 1:
                                            break;

                                        case 2:
                                            break;

                                        case 3:
                                            break;

                                        case 4:
                                            break;

                                        case 5:
                                            break;
                                    }
                                }while (empMenu != 0);
                                break;
                        }
                    }while (perMenu != 0);
                    break;
            }
        }while (menuCase != 0);
    }

    private static void showPersonMenu() {
        System.out.println("--------------PERSON--------------");
        System.out.println("1. READER");
        System.out.println("2. EMPLOYEE");
        System.out.println("0. EXIT");
    }

    private static void showMenuOf(String string) {
        System.out.println("1. TO ADD NEW " + string);
        System.out.println("2. TO SHOW LIST " + string);
        System.out.println("3. TO EDIT " + string);
        System.out.println("4. TO REMOVE " + string);
        System.out.println("5. TO FIND " + string);
        System.out.println("0. EXIT");

    }

    private static void showMenu() {
        System.out.println("---------------MENU---------------");
        System.out.println("1. DOCUMENT");
        System.out.println("2. PERSON");
        System.out.println("0. EXIT");
    }
}
