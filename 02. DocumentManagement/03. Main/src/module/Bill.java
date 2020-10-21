package module;

import java.util.Date;

public class Bill {

	private String billId;
	private Date startDate;
	private Date dueDate;
	private float deposit;
	private Borrowing borrowing;

	public Bill() {
		// TODO - implement Bill.Bill
		throw new UnsupportedOperationException();
	}

	public Bill(String billId, Date startDate,
		Date dueDate, float deposit, Borrowing borrowing) {
		this.billId = billId;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.deposit = deposit;
		this.borrowing = borrowing;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public Borrowing getBorrowing() {
		return borrowing;
	}

	public void setBorrowing(Borrowing borrowing) {
		this.borrowing = borrowing;
	}

	@Override
	public String toString() {
		return "Bill{" +
				"billId='" + billId + '\'' +
				", startDate=" + startDate +
				", dueDate=" + dueDate +
				", deposit=" + deposit +
				", borrowing=" + borrowing +
				'}';
	}
}