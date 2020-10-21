package view;

import controller.ControllerData;
import controller.ControllerUtility;
import module.document.Book;
import module.document.Document;
import module.management.BorrowReceipt;
import module.management.Management;
import module.person.Employee;
import module.person.Person;
import module.person.Reader;

import javax.print.Doc;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View {
    public static void main(String[] args) {
        var controller = new ControllerData();
        var controlUtility = new ControllerUtility();
        var sc = new Scanner(System.in);

        var books = new ArrayList<Book>();
        var readers = new ArrayList<Reader>();
        var employees = new ArrayList<Employee>();
        var managements = new ArrayList<Management>();

        int mainMenu;
        do{
            showMenu();
            mainMenu = sc.nextInt();
            sc.nextLine();
            switch (mainMenu){
                case 0:
                    break;

                case 1:
                    int docMenu;
                    do {
                        System.out.println("-----------DOCUMENT MENU----------");
                        showMenuOf("BOOk");
                        docMenu = sc.nextInt();
                        sc.nextLine();

                        switch (docMenu){
                            case 0:
                                break;

                            case 1:
                                System.out.println("-----------ADD NEW BOOK-----------");
                                Book book = addNewBook();
                                controller.writeBookToSQL(book);
                                break;

                            case 2:
                                books = controller.readBookFromSQL();
                                showBookInfo(books);
                                break;

                            case 3:
                                System.out.println("-------------EDIT BOOK------------");
                                books = controller.readBookFromSQL();
                                showBookInfo(books);

                                System.out.println("BOOK ID");
                                String bookId = sc.nextLine();

                                if (checkBookId(bookId, books)){
                                    book = addNewBook();
                                    controller.updateBookToSQL(bookId, book);
                                }else
                                    System.out.println("ID BOOK IS NOT VALID");
                                break;

                            case 4:
                                System.out.println("------------DELETE BOOK-----------");
                                books = controller.readBookFromSQL();
                                showBookInfo(books);
                                System.out.println("BOOK ID");
                                bookId = sc.nextLine();

                                if (checkBookId(bookId, books)){
                                    controller.deleteBookFromSQL(bookId);
                                }else
                                    System.out.println("ID BOOK IS NOT VALID");
                                break;

                            case 5:
                                System.out.println("-------------FIND BOOK------------");
                                books = controller.readBookFromSQL();
                                showBookInfo(books);

                                System.out.println("INPUT NAME");
                                String bookName = sc.nextLine();

                                books = controlUtility.findBook(bookName, books);
                                System.out.println("---------------RESULT-------------");
                                showBookInfo(books);
                                break;
                        }
                    }while (docMenu != 0);
                    break;

                case 2:
                    int perMenu;
                    showPersonMenu();
                    perMenu = sc.nextInt();
                    sc.nextLine();

                    switch (perMenu){
                        case 0:
                            break;

                        case 1:
                            int readerMenu;

                            do {
                                System.out.println("------------READER MENU-----------");
                                showMenuOf("READER");
                                readerMenu = sc.nextInt();
                                sc.nextLine();

                                switch (readerMenu){
                                    case 0:
                                        break;

                                    case 1:
                                        System.out.println("----------ADD NEW READER----------");
                                        Reader reader = addNewReader();
                                        controller.writeReaderToSQL(reader);
                                        break;

                                    case 2:
                                        System.out.println("------------LIST READER-----------");
                                        readers = controller.readReaderFromSQL();
                                        showReaderInfo(readers);
                                        break;

                                    case 3:
                                        String readId;
                                        System.out.println("------------EDIT READER-----------");
                                        readers = controller.readReaderFromSQL();
                                        showReaderInfo(readers);

                                        do {
                                            System.out.println("READER ID");
                                            readId = sc.nextLine();
                                            if (checkReaderId(readId, readers))
                                                break;
                                            else
                                                System.out.println("READER ID IS NOT VALID");
                                        }while (true);

                                        reader = addNewReader();
                                        controller.updateReaderToSQL(readId, reader);

                                        break;

                                    case 4:
                                        System.out.println("-----------DELETE READER----------");
                                        readers = controller.readReaderFromSQL();
                                        showReaderInfo(readers);

                                        do {
                                            System.out.println("READER ID");
                                            readId = sc.nextLine();
                                            if (checkReaderId(readId, readers))
                                                break;
                                            else
                                                System.out.println("READER ID IS NOT VALID");
                                        }while (true);

                                        controller.deleteReaderFromSQL(readId);
                                        break;

                                    case 5:
                                        String readName;
                                        System.out.println("------------FIND READER-----------");
                                        readers = controller.readReaderFromSQL();
                                        showReaderInfo(readers);

                                        System.out.println("READER NAME");
                                        readName = sc.nextLine();
                                        readers = controlUtility.findReader(readName, readers);
                                        showReaderInfo(readers);
                                        break;
                                }
                            }while (readerMenu != 0);
                            break;

                        case 2:
                            int empMenu;

                            do {
                                System.out.println("-----------EMPLOYEE MENU----------");
                                showMenuOf("EMPLOYEE");
                                empMenu = sc.nextInt();
                                sc.nextLine();

                                switch (empMenu){
                                    case 0:
                                        break;

                                    case 1:
                                        System.out.println("----------ADD NEW EMPLOYEE--------");
                                        Employee employee = addNewEmployee();
                                        controller.writeEmpToSQL(employee);
                                        break;

                                    case 2:
                                        System.out.println("-----------LIST EMPLOYEE----------");
                                        employees = controller.readEmpFromSQL();
                                        showEmpInfo(employees);
                                        break;

                                    case 3:
                                        String empId;
                                        System.out.println("-----------EDIT EMPLOYEE----------");
                                        employees = controller.readEmpFromSQL();
                                        showEmpInfo(employees);

                                        do {
                                            System.out.println("EMPLOYEE ID");
                                            empId = sc.nextLine();
                                            if (checkEmpId(empId, employees))
                                                break;
                                            else
                                                System.out.println("EMPLOYEE ID IS NOT VALID");
                                        }while (true);

                                        employee = addNewEmployee();
                                        controller.updateEmpToSQL(empId, employee);
                                        break;

                                    case 4:
                                        System.out.println("----------DELETE EMPLOYEE---------");
                                        employees = controller.readEmpFromSQL();
                                        showEmpInfo(employees);

                                        do {
                                            System.out.println("EMPLOYEE ID");
                                            empId = sc.nextLine();
                                            if (checkEmpId(empId, employees))
                                                break;
                                            else
                                                System.out.println("EMPLOYEE ID IS NOT VALID");
                                        }while (true);

                                        controller.deleteEmpFromSQL(empId);
                                        break;

                                    case 5:
                                        System.out.println("-----------FIND EMPLOYEE----------");
                                        employees = controller.readEmpFromSQL();
                                        showEmpInfo(employees);

                                        System.out.println("EMPLOYEE NAME");
                                        String empName = sc.nextLine();
                                        employees = controlUtility.finEmployee(empName, employees);
                                        showEmpInfo(employees);
                                        break;
                                }
                            }while (empMenu != 0);
                            break;
                    }
                    break;

                case 3:
                    int mnMenu;
                    showManagementMenu();
                    mnMenu = sc.nextInt();
                    sc.nextLine();

                    switch (mnMenu){
                        case 0:
                            System.out.println("----------MANAGEMENT MENU---------");
                            break;

                        case 1:
                            managements = controller.readMngFromSQL();
                            employees = controller.readEmpFromSQL();
                            books = controller.readBookFromSQL();
                            readers = controller.readReaderFromSQL();
                            System.out.println("-----CREATE NEW READER BORROW-----");
                            Management management = addNewManagement(
                                    managements, employees, books, readers);
                            controller.writeMngToSQL(management);
                            break;

                        case 2:
                            System.out.println("----------LIST RECEPTION----------");
                            managements = controller.readMngFromSQL();
                            showMngInfo(managements);
                            break;

                        case 3:
                            break;

                        case 4:
                            break;

                        case 5:
                            break;
                    }
                    break;

                case 8:
                    System.out.println(
                            new SimpleDateFormat("dd/MM/yyyy").
                                    format(new Date()));
            }
        }while(mainMenu != 0);
    }

    private static void showMngInfo(
            ArrayList<Management> managements) {
        for(var m : managements)
            System.out.println(m);
    }

    private static Management addNewManagement(
            ArrayList<Management> managements, ArrayList<Employee> employees,
            ArrayList<Book> books, ArrayList<Reader> readers) {
        var sc = new Scanner(System.in);
        String managementId, bookState;
        int totalBorrow;

        System.out.println("----------NEW MANAGEMENT----------");
        showMngInfo(managements);
        do {
            System.out.println("MANAGEMENT ID: ");
            managementId = sc.nextLine();
        }while (!checkMngId(managementId, managements));

        System.out.println("BOOK STATE: ");
        bookState = sc.nextLine();

        totalBorrow = 0;

        BorrowReceipt receipt = addNewReceipt(employees, books, readers);

        Management management = new Management(
                receipt, managementId, bookState, totalBorrow );
        return management;
    }

    private static boolean checkMngId(
            String managementId, ArrayList<Management> managements) {
        for (var m : managements){
            if (m.getManagementId().compareTo(managementId) == 0)
                return false;
        }
        return true;
    }

    private static BorrowReceipt addNewReceipt(
            ArrayList<Employee> employees,
            ArrayList<Book> books, ArrayList<Reader> readers) {
        var sc = new Scanner(System.in);

        String readId, bookId, empId, receiptId, date;
        int term, quantity;
        float fee;

        System.out.println("-----------NEW RECEPTION----------");

        showReaderInfo(readers);
        do{
            System.out.println("READER ID: ");
            readId = sc.nextLine();
        }while (!checkReaderId(readId, readers));

        showBookInfo(books);
        do {
            System.out.println("BOOK ID: ");
            bookId = sc.nextLine();
        }while (!checkBookId(bookId, books));

        showEmpInfo(employees);
        do {
            System.out.println("EMPLOYEE ID: ");
            empId = sc.nextLine();
        }while (!checkEmpId(empId, employees));

        System.out.println("RECEIPT ID: ");
        receiptId = sc.nextLine();

        System.out.println("BORROW TERM: ");
        term = sc.nextInt();

        System.out.println("BORROW QUANTITY: ");
        quantity = sc.nextInt();

        System.out.println("BORROW FEE: ");
        fee = sc.nextFloat();

        date = new SimpleDateFormat("hh:mm dd/MM/yyyy").format(new Date());
        System.out.println("DATE: " + date);

        BorrowReceipt receipt = new BorrowReceipt(
                new Reader(readId), new Book(bookId), new Employee(empId),
                receiptId, term, quantity, fee, date);

        return receipt;
    }

    private static void showManagementMenu() {
        System.out.println("----------MANAGEMENT MENU---------");
        System.out.println("1. TO CREATE NEW READER BORROW");
        System.out.println("2. TO SHOW LIST READER BORROW");
        System.out.println("3. TO EDIT READER BORROW");
        System.out.println("4. TO DELETE READER BORROW");
        System.out.println("5. TO SORT READER BORROW");
        System.out.println("6. TO FIND READER BORROW");
        System.out.println("7. TO SHOW READER BORROW MIN/MAX");
        System.out.println("8. TO FIND BOOK BORROWED MIN/MAX");
        System.out.println("0. TO BACK");
    }

    private static boolean checkEmpId(
            String empId, ArrayList<Employee> employees) {
        for (var e : employees){
            if (e.getEmpId().compareTo(empId) == 0)
                return true;
        }
        return false;
    }

    private static void showEmpInfo(
            ArrayList<Employee> employees) {
        for (var e : employees)
            System.out.println(e);
    }

    private static Employee addNewEmployee() {
        var sc = new Scanner(System.in);
        var person = addNewPerson();

        String empId, empPosition;
        int empShift;

        System.out.println("EMPLOYEE ID");
        empId = sc.nextLine();

        System.out.println("EMPLOYEE POSITION");
        empPosition = sc.nextLine();

        System.out.println("EMPLOYEE SHIFT");
        empShift = sc.nextInt();
        sc.nextLine();

        Employee employee = new Employee(
                person, empId, empPosition, empShift);

        return employee;
    }

    private static boolean checkReaderId(
            String readId, ArrayList<Reader> readers) {
        for (var r : readers){
            if (r.getReaderId().compareTo(readId) == 0)
                return true;
        }
        return false;
    }

    private static void showReaderInfo(
            ArrayList<Reader> readers) {
        for (var r : readers)
            System.out.println(r);
    }

    private static Reader addNewReader() {
        var sc = new Scanner(System.in);

        String readId, readType, readPhone, readEmail;

        Person person = addNewPerson();

        System.out.println("READER ID");
        readId = sc.nextLine();

        System.out.println("READER TYPE");
        readType = sc.nextLine();

        System.out.println("READER PHONE");
        readPhone = sc.nextLine();

        System.out.println("READER EMAIL");
        readEmail = sc.nextLine();

        Reader reader = new Reader(
                person, readId, readType, readPhone, readEmail);

        return reader;
    }

    private static Person addNewPerson() {
        var sc = new Scanner(System.in);

        String perId, perName, perAddress, perDob, perSex;

        System.out.println("PERSON IDENTIFY");
        perId = sc.nextLine();

        System.out.println("PERSON FULL NAME");
        perName = sc.nextLine();

        System.out.println("PERSON ADDRESS");
        perAddress = sc.nextLine();

        System.out.println("PERSON DATE OF BIRTH");
        perDob = sc.nextLine();

        System.out.println("PERSON SEX");
        perSex = sc.nextLine();

        Person person = new Person(
                perId, perName, perAddress, perDob, perSex);

        return person;
    }

    private static void showPersonMenu() {
        System.out.println("------------PERSON MENU-----------");
        System.out.println("1. READER");
        System.out.println("2. EMPLOYEE");
        System.out.println("0. BACK");
    }

    private static boolean checkBookId(
            String bookId, ArrayList<Book> books) {
        for (var b : books){
            if (b.getBookId().compareTo(bookId) == 0){
                return true;
            }
        }
        return false;
    }

    private static Book addNewBook() {
        var sc = new Scanner(System.in);

        String bookId, docName, docAuthor;
        int docPublish, docQuantity, type;
        String[] bookType = {"SCIENCE", "ART", "ECONOMIC", "FOOD", "IT"};

        do{
            System.out.println("BOOK ID");
            bookId = sc.nextLine();
            Matcher matcher = Pattern.compile("^DCMT_\\d{6}").matcher(bookId);
            if (matcher.find())
                break;
            else {
                System.out.println("*****BOOK ID FORM: DCMT_xxxxxx");
            }
        }while (true);

        do{
            System.out.println("BOOK TYPE");
            System.out.println("1. SCIENCE \n2. ART \n" +
                    "3. ECONOMIC \n4. FOOD \n5. IT");
            type = sc.nextInt();
        }while (type < 1 || type > 5);
        sc.nextLine();

        System.out.println("DOCUMENT NAME");
        docName = sc.nextLine();

        System.out.println("DOCUMENT AUTHOR");
        docAuthor = sc.nextLine();

        System.out.println("DOCUMENT PUBLISH YEAR");
        docPublish = sc.nextInt();

        System.out.println("DOCUMENT QUANTITY");
        docQuantity = sc.nextInt();
        sc.nextLine();

        Document document = new Document(
                docName, docAuthor, docPublish, docQuantity);

        Book book = new Book(document, bookId, bookType[type - 1]);

        return book;
    }

    private static void showBookInfo(ArrayList<Book> books) {
        for (var b : books)
            System.out.println(b);
    }

    private static void showMenuOf(String name) {
        System.out.println("1. TO ADD NEW " + name);
        System.out.println("2. TO SHOW LIST " + name);
        System.out.println("3. TO EDIT " + name);
        System.out.println("4. TO DELETE " + name);
        System.out.println("5. TO FIND " + name);
        System.out.println("0. TO BACK");
    }

    private static void showMenu() {
        System.out.println("---------------MENU---------------");
        System.out.println("1. DOCUMENT");
        System.out.println("2. PERSON");
        System.out.println("3. MANAGEMENT");
        System.out.println("0. EXIT");
    }
}