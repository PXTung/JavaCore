package controller;

import ctr.BookCTR;
import dao.BookDAO;
import model.Book;
import model.Document;
import model.Menu;

import java.util.List;
import java.util.Scanner;

public enum Controller {
    INSTANCE;

    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);

    public int mainMenu(){
        int menuCase;
        menu.mainMenu();
        menuCase = sc.nextInt();
        sc.nextLine();
        return menuCase;
    }

    public void document(){
        int docCase;
        do {
            menu.docMenu();
            docCase = sc.nextInt();
            sc.nextLine();
            switch (docCase){
                case 0:
                    break;

                case 1:
                    Book book = (Book) BookCTR.getInstance().addFromKeyboard();
                    BookDAO.getInstance().addNew(book);
                    break;

                case 2:
                    List<Document> books = BookDAO.getInstance().getAll();
                    BookDAO.getInstance().showInfo(books);
                    break;
            }
        }while (docCase != 0);
    }

    public void person(){
        int perCase;
        do {
            menu.perMenu();
            perCase = sc.nextInt();
            sc.nextLine();
            switch (perCase){
                case 0:
                    break;

                case 1:
                    reader();
                    break;

                case 2:
                    employee();
                    break;
            }
        }while (perCase != 0);
    }

    private void employee() {
        int empCase;
        do{
            menu.menuOf("employee");
            empCase = sc.nextInt();
            sc.nextLine();
            switch (empCase){
                case 0:

                    break;
            }
        }while (empCase != 0);
    }

    private void reader() {
        int redCase;
        do{
            menu.menuOf("reader");
            redCase = sc.nextInt();
            sc.nextLine();
            switch (redCase){
                case 0:

                    break;
            }
        }while (redCase != 0);
    }
}