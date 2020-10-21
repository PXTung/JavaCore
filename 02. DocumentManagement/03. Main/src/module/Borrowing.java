package module;

public class Borrowing {

	private String brwId;
	private Reader reader;
	private Employee employee;
	private BookState state;
	private int total;

	public Borrowing() {
		// TODO - implement Borrowing.Borrowing
		throw new UnsupportedOperationException();
	}

	public Borrowing(String brwId,
					 Reader reader, Employee employee,
					 BookState state, int total) {
		this.brwId = brwId;
		this.reader = reader;
		this.employee = employee;
		this.state = state;
		this.total = total;
	}

	public String getBrwId() {
		return brwId;
	}

	public void setBrwId(String brwId) {
		this.brwId = brwId;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BookState getState() {
		return state;
	}

	public void setState(BookState state) {
		this.state = state;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Borrowing{" +
				"brwId='" + brwId + '\'' +
				", reader=" + reader +
				", employee=" + employee +
				", state=" + state +
				", total=" + total +
				'}';
	}
}