package ctr;

import m_Interface.CTR;
import model.Document;

import java.util.Scanner;

public class DocumentCTR implements CTR<Document> {
    @Override
    public Document addFromKeyboard() {
        Scanner sc = new Scanner(System.in);

        String docName, docAuthor;
        int docPYear, docQuantity;

        System.out.println("DOCUMENT NAME: ");
        docName = sc.nextLine();

        System.out.println("DOCUMENT AUTHOR: ");
        docAuthor = sc.nextLine();

        System.out.println("DOCUMENT PUBLIC YEAR: ");
        docPYear = sc.nextInt();
        sc.nextLine();

        System.out.println("DOCUMENT QUANTITY: ");
        docQuantity = sc.nextInt();
        sc.nextLine();

        return new Document(docName, docAuthor, docPYear, docQuantity);
    }
}
