package module;

public class Book extends Document {

	private String bookId;
	private String type;

	public Book() {
		// TODO - implement Book.Book
		throw new UnsupportedOperationException();
	}

	public Book(String docId, String author, int publishYear, int quantity,
				String bookId, String type) {
		super(docId, author, publishYear, quantity);
		this.bookId = bookId;
		this.type = type;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bookId='" + bookId + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}