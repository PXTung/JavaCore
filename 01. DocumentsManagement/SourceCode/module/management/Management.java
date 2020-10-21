package module.management;

import module.document.Book;
import module.person.Employee;
import module.person.Reader;

import java.util.Date;

public class Management extends BorrowReceipt {

	private String managementId;
	private String bookState;
	private int totalBorrow;

	public Management() {
	}

	public Management(BorrowReceipt borrowReceipt,
					  String managementId, String bookState,
					  int totalBorrow) {
		super(borrowReceipt.getReader(), borrowReceipt.getBook(),
				borrowReceipt.getEmployee(), borrowReceipt.getReceiptId(),
				borrowReceipt.getTerm(), borrowReceipt.getBorrowQuantity(),
				borrowReceipt.getReceiptFee(), borrowReceipt.getDate());
		this.managementId = managementId;
		this.bookState = bookState;
		this.totalBorrow = totalBorrow;
	}

	public String getManagementId() {
		return managementId;
	}

	public void setManagementId(String managementId) {
		this.managementId = managementId;
	}

	public String getBookState() {
		return bookState;
	}

	public void setBookState(String bookState) {
		this.bookState = bookState;
	}

	public int getTotalBorrow() {
		return totalBorrow;
	}

	public void setTotalBorrow(int totalBorrow) {
		this.totalBorrow = totalBorrow;
	}

	@Override
	public String toString() {
		return "Management{" +
				"managementId='" + managementId + '\'' +
				", bookState='" + bookState + '\'' +
				", totalBorrow=" + totalBorrow +
				'}' + super.toString();
	}
}