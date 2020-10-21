package module.document;

public class Book extends Document {

	private String bookId;
	private String bookType;

	public Book() {
	}

	public Book(String bookId) {
		this.bookId = bookId;
	}

	public Book(Document document, String bookId, String bookType) {
		super(document.getDocName(), document.getDocAuthor(),
				document.getDocPublish(), document.getDocQuantity());
		this.bookId = bookId;
		this.bookType = bookType;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bookId='" + bookId + '\'' +
				", bookType='" + bookType + '\'' +
				'}' + super.toString();
	}
}