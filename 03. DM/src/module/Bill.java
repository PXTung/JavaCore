package module;

public class Bill {
    private String billId;
    private String startDate;
    private String dueDate;
    private Reader reader;
    private Book book;
    private Employee employee;
    private float deposit;

    public Bill() {
    }

    public Bill(String billId, String startDate,
                String dueDate, Reader reader, Book book,
                Employee employee, float deposit) {
        this.billId = billId;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.reader = reader;
        this.book = book;
        this.employee = employee;
        this.deposit = deposit;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
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

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId='" + billId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", reader=" + reader +
                ", book=" + book +
                ", employee=" + employee +
                ", deposit=" + deposit +
                '}';
    }
}
