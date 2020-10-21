package controller;

import m_interface.Ctr;
import module.Document;

import java.util.Scanner;

public class DocumentCtr implements Ctr<Document> {
    @Override
    public Document addFromKeyBoard() {
        var sc = new Scanner(System.in);

        String docName, author;
        int publishYear, quantity;

        System.out.println("DOCUMENT NAME: ");
        docName = sc.nextLine();

        System.out.println("DOCUMENT AUTHOR: ");
        author = sc.nextLine();

        System.out.println("DOCUMENT PUBLISH YEAR: ");
        publishYear = sc.nextInt();
        sc.nextLine();

        System.out.println("DOCUMENT QUANTITY: ");
        quantity = sc.nextInt();
        sc.nextLine();

        return new Document(docName, author, publishYear, quantity);
    }
}
