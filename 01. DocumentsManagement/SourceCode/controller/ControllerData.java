package controller;

import module.document.Book;
import module.document.Document;
import module.management.BorrowReceipt;
import module.management.Management;
import module.person.Employee;
import module.person.Person;
import module.person.Reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public  class ControllerData{
	private Connection getSQLConnection(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			final String url = "jdbc:sqlserver://localhost:1433;databaseName = Dm";
			final String user = "sa";
			final String pass = "Tungtung96";

			Connection connection = DriverManager.getConnection(url, user, pass);
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	public void writeBookToSQL(Book book){
		try {
			var connection = getSQLConnection();
			var statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Book " +
					"VALUES('" +
					book.getBookId() + "', '" + book.getBookType() + "', '" +
					book.getDocName() + "', '" + book.getDocAuthor() + "', '" +
					book.getDocPublish() + "', '" + book.getDocQuantity() + "')"
			);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public ArrayList<Book> readBookFromSQL(){
		var books = new ArrayList<Book>();
		try {
			var connection = getSQLConnection();
			var statement = connection.createStatement();
			var resultSet = statement.executeQuery(
					"SELECT * FROM Book");

			while (resultSet.next()){
				var bookId = resultSet.getString("BOOKID");
				var bookType = resultSet.getString("BOOKTYPE");
				var docName = resultSet.getString("BOOKNAME");
				var docAuthor = resultSet.getString("BOOKAUTHOR");
				var docPublish = resultSet.getInt("PUBLISHYEAR");
				var docQuantity = resultSet.getInt("QUANTITY");

				Document document = new Document(
						docName, docAuthor, docPublish, docQuantity);

				Book book = new Book(document, bookId, bookType);

				books.add(book);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return books;
	}

	public void updateBookToSQL(String bookId, Book book) {
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			statement.executeUpdate("UPDATE Book " + "SET " +
					"BOOKID = '" + book.getBookId() +
					"', BOOKTYPE = '" + book.getBookType() +
					"', BOOKNAME = '" +	book.getDocName() +
					"', BOOKAUTHOR = '" + book.getDocAuthor() +
					"', PUBLISHYEAR = '" + book.getDocPublish() +
					"', QUANTITY = '" + book.getDocQuantity() +
					"'" + " WHERE BOOKID = '" + bookId + "'"
			);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public void deleteBookFromSQL(String bookId) {
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM Book " +
					"WHERE BOOKID = " + "'" + bookId + "'");
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public void writeReaderToSQL(Reader reader) {
		var connection = getSQLConnection();
		try{
			var statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Reader " +
					"VALUES('" + reader.getReaderId() +
					"', '" + reader.getReaderType() +
					"', ' " + reader.getReaderPhone() +
					"', '" + reader.getReaderEmail() +
					"', '" + reader.getPerId() +
					"', '" + reader.getFullName() +
					"', '" + reader.getAddress() +
					"', '" + reader.getDob() +
					"', '" + reader.getSex() + "')"
			);
		}catch (SQLException throwables){
			throwables.printStackTrace();
		}
	}

	public ArrayList<Reader> readReaderFromSQL() {
		var connection = getSQLConnection();
		var readers = new ArrayList<Reader>();
		try {
			var statement = connection.createStatement();
			var resultSet =
					statement.executeQuery("SELECT * FROM Reader");

			while(resultSet.next()){
				var readId = resultSet.getString("READID");
				var readType = resultSet.getString("TYPE");
				var readPhone = resultSet.getString("PHONE");
				var readEmail = resultSet.getString("EMAIL");
				var perId = resultSet.getString("PERID");
				var perName = resultSet.getString("NAME");
				var perAddress = resultSet.getString("ADDRESS");
				var perDob = resultSet.getString("DOB");
				var perSex = resultSet.getString("SEX");

				Person person = new Person(
						perId, perName, perAddress, perDob, perSex);

				Reader reader = new Reader(
						person, readId, readType, readPhone, readEmail);

				readers.add(reader);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}

		return readers;
	}

	public void updateReaderToSQL(String readId, Reader reader) {
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			statement.executeUpdate("UPDATE Reader SET " +
					"READID = " + reader.getReaderId() +
					", TYPE = " + reader.getReaderType() +
					", PHONE = " + reader.getReaderPhone() +
					", EMAIL = " + reader.getReaderEmail() +
					", PERID = " + reader.getPerId() +
					", NAME = " + reader.getFullName() +
					", ADDRESS = " + reader.getAddress() +
					", DOB = " + reader.getDob() +
					", SEX = " + reader.getSex() +
					"WHERE READID = '" + readId + "'"
			);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public void deleteReaderFromSQL(String readId) {
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM Reader " +
			"WHERE READID = '" + readId + "'");
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

    public void writeEmpToSQL(Employee emp) {
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Employee " +
					"VALUES ('" + emp.getEmpId() +
					"', '" + emp.getEmpPosition() +
					"', '" + emp.getEmpShift() +
					"', '" + emp.getPerId() +
					"', '" + emp.getFullName() +
					"', '" + emp.getAddress() +
					"', '" + emp.getDob() +
					"', '" + emp.getSex() + "')"
			);
		}catch (SQLException throwables){
			throwables.printStackTrace();
		}
    }

    public ArrayList<Employee> readEmpFromSQL(){
		var connection = getSQLConnection();
		var employees = new ArrayList<Employee>();
		try {
			var statement = connection.createStatement();
			var resultSet = statement.
					executeQuery("SELECT * FROM Employee");

			while (resultSet.next()){
				var empId = resultSet.getString("EMPID");
				var empPosition = resultSet.getString("POSITION");
				var empShift = resultSet.getInt("SHIFT");
				var perId = resultSet.getString("PERID");
				var perName = resultSet.getString("NAME");
				var perAddress = resultSet.getString("ADDRESS");
				var perDob = resultSet.getString("DOB");
				var perSex = resultSet.getString("SEX");

				Person person = new Person(
						perId, perName, perAddress, perDob, perSex);

				Employee employee = new Employee(
						person, empId, empPosition, empShift);

				employees.add(employee);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return employees;
	}

	public void updateEmpToSQL(String empId, Employee employee) {
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			statement.executeUpdate("UPDATE Employee SET " +
					"EMPID = '" + employee.getEmpId() +
					"', POSITION = '" + employee.getEmpPosition() +
					"', SHIFT = '" + employee.getEmpShift() +
					"', PERID = '" + employee.getPerId() +
					"', NAME = '" + employee.getFullName() +
					"', ADDRESS = '" + employee.getAddress() +
					"', DOB = '" + employee.getDob() +
					"', SEX = '" + employee.getSex() +
					"' WHERE EMPID = '" + empId + "'"
			);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public void deleteEmpFromSQL(String empId) {
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			statement.executeUpdate(
					"DELETE FROM Employee WHERE EMPID = '" + empId + "'");
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

    public void writeMngToSQL(Management mng) {
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Management " +
					"VALUES ('" + mng.getManagementId() +
					"', '" + mng.getBookState() +
					"', '" + mng.getTotalBorrow() +
					"', '" + mng.getReceiptId() +
					"', '" + mng.getReader().getReaderId() +
					"', '" + mng.getBook().getBookId() +
					"', '" + mng.getEmployee().getEmpId() +
					"', '" + mng.getTerm() +
					"', '" + mng.getBorrowQuantity() +
					"', '" + mng.getReceiptFee() +
					"', '" + mng.getDate() + "')"
			);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public ArrayList<Management> readMngFromSQL() {
		var managements = new ArrayList<Management>();
		var connection = getSQLConnection();
		try {
			var statement = connection.createStatement();
			var resultSet =
					statement.executeQuery("SELECT * FROM Management");
			while (resultSet.next()){
				var mngId = resultSet.getString("MANAGEMENTID");
				var bookState = resultSet.getString("BOOKSTATE");
				var totalBorrow = resultSet.getInt("TOTALBORROWED");
				var receiptId = resultSet.getString("RECEIPTID");
				var readerId = resultSet.getString("READERID");
				var bookId = resultSet.getString("BOOKID");
				var eployeeId = resultSet.getString("EMPLOYEEID");
				var term = resultSet.getInt("TERM");
				var quantity = resultSet.getInt("QUANTITY");
				var fee = resultSet.getFloat("FEE");
				var date = resultSet.getString("DATE");

				BorrowReceipt receipt = new BorrowReceipt(
						new Reader(readerId), new Book(bookId), new Employee(eployeeId),
						receiptId, term, quantity, fee, date);

				Management management = new Management(
						receipt, mngId, bookState, totalBorrow);

				managements.add(management);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return managements;
	}
}