package controller;

import DAO.BookDAO;
import module.Book;
import module.Document;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookCtr extends DocumentCtr{
    @Override
    public Book addFromKeyBoard() {
        var sc = new Scanner(System.in);
        String bookId;
        String[] type = {"SCIENCE", "ART", "ECONOMIC", "FOOD", "IT"};
        int typeCase;

        Document document = super.addFromKeyBoard();

        do{
            System.out.println("BOOK ID: ");
            bookId = sc.nextLine();
        }while (!checkBookId(bookId));

        do{
            System.out.println("BOOK TYPE: ");
            System.out.println("1. SCIENCE \n2. ART " +
                    "\n3. ECONOMIC \n4. FOOD \n5. IT");
            typeCase = sc.nextInt();
            sc.nextLine();
        }while (typeCase < 1 || typeCase > 5);

        Book book = new Book(document, bookId, type[typeCase - 1]);

        return book;
    }

    private boolean checkBookId(String bookId) {
        var bookDAO = new BookDAO();
        var books = bookDAO.getListBook();

        var matcher =
                Pattern.compile("^DCMT_\\d{6}$").matcher(bookId);
        if (matcher.find()){
            for (var b : books){
                if (b.getBookId().compareTo(bookId) == 0)
                    return false;
            }
            return true;
        }
        return false;
    }
}
