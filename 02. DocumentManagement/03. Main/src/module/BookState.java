package module;

public class BookState {

	private Book book;
	private int quantity;
	private String sate;

	public BookState() {
		// TODO - implement module.BookState.module.BookState
		throw new UnsupportedOperationException();
	}

	public BookState(Book book, int quantity, String sate) {
		this.book = book;
		this.quantity = quantity;
		this.sate = sate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSate() {
		return sate;
	}

	public void setSate(String sate) {
		this.sate = sate;
	}

	@Override
	public String toString() {
		return "BookState{" +
				"book=" + book +
				", quantity=" + quantity +
				", sate='" + sate + '\'' +
				'}';
	}
}