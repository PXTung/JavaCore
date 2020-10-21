package ctr;

import model.Book;
import model.Document;

import java.util.Scanner;

public class BookCTR extends DocumentCTR {
    private static BookCTR instance;

    public static BookCTR getInstance(){
        instance = new BookCTR();
        return instance;
    }

    @Override
    public Document addFromKeyboard() {
        Scanner sc = new Scanner(System.in);
        Document document = super.addFromKeyboard();

        String bId;
        int type;
        String[] bType = {"SCIENCE", "ART", "ECONOMIC", "FOOD", "IT"};

        System.out.println("BOOK ID: ");
        bId = sc.nextLine();

        do {
            System.out.println("BOOK TYPE: ");
            System.out.println("1. SCIENCE \n2. ART " +
                    "\n3. ECONOMIC \n4. FOOD \n5. IT");
            type = sc.nextInt();
            sc.nextLine();
        }while (type < 1 || type > 5);

        return new Book(document, bId, bType[type - 1]);
    }
}
