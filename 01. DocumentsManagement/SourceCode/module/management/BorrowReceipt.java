package module.management;

import module.person.*;
import module.document.*;

import java.util.Date;

public class BorrowReceipt {

	private Reader reader;
	private Book book;
	private Employee employee;
	private String receiptId;
	private int term;
	private int borrowQuantity;
	private Float receiptFee;
	private String date;

	public BorrowReceipt() {
	}

	public BorrowReceipt(Reader reader, Book book, Employee employee,
						 String receiptId, int term, int borrowQuantity,
						 Float receiptFee, String date) {
		this.reader = reader;
		this.book = book;
		this.employee = employee;
		this.receiptId = receiptId;
		this.term = term;
		this.borrowQuantity = borrowQuantity;
		this.receiptFee = receiptFee;
		this.date = date;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public int getBorrowQuantity() {
		return borrowQuantity;
	}

	public void setBorrowQuantity(int borrowQuantity) {
		this.borrowQuantity = borrowQuantity;
	}

	public Float getReceiptFee() {
		return receiptFee;
	}

	public void setReceiptFee(Float receiptFee) {
		this.receiptFee = receiptFee;
	}

	@Override
	public String toString() {
		return "BorrowReceipt{" +
				"receiptId='" + receiptId + '\'' +
				", readerId=" + reader.getReaderId() +
				", bookId=" + book.getBookId() +
				", employeeId=" + employee.getEmpId() +
				", term=" + term +
				", borrowQuantity=" + borrowQuantity +
				", receiptFee=" + receiptFee +
				", date=" + date +
				'}';
	}
}