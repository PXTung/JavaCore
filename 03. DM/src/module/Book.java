package module;

public class Book extends Document {
    private String bookId;
    private String type;

    public Book(String bookId) {
        this.bookId = bookId;
    }

    public Book(Document document,
                String bookId, String type) {
        super(document.getDocName(), document.getAuthor(),
            document.getPublishYear(), document.getQuantity());
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
                '}' + super.toString();
    }
}
