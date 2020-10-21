package view;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int menuCase;
        do{
            showMenu();
            menuCase = sc.nextInt();
            sc.nextLine();
            switch (menuCase){
                case 0:
                    System.out.println("--------------------------------------");
                    break;

                case 1:
                    int documentCase;
                    do {
                        showMenuOf("DOCUMENT");
                        documentCase = sc.nextInt();
                        sc.nextLine();
                        switch (documentCase){
                            case 0:
                                break;

                            case 1:
                                break;
                        }
                    }while (documentCase != 0);
                    break;
            }
        }while (menuCase != 0);
    }

    private static void showMenuOf(String document) {
        System.out.println("------------DOCUMENT MENU-------------");
        System.out.println("1. ADD NEW BOOK");
        System.out.println("2. SHOW LIST BOOK");
        System.out.println("3. EDIT BOOK");
        System.out.println("4. REMOVE BOOK");
        System.out.println("5. SEARCH BOOK");
        System.out.println("--------------------------------------");
    }

    private static void showMenu() {
        System.out.println("-----------------MENU-----------------");
        System.out.println("1. DOCUMENT");
        System.out.println("2. PERSON");
        System.out.println("3. MANAGEMENT");
        System.out.println("0. EXIT");
        System.out.println("--------------------------------------");
    }
}
