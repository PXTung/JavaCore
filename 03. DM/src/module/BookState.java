package module;

public class BookState {
    private Book book;
    private String bookState;
    private int quantity;

    public BookState() {
    }

    public BookState(Book book, String bookState, int quantity) {
        this.book = book;
        this.bookState = bookState;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBookState() {
        return bookState;
    }

    public void setBookState(String bookState) {
        this.bookState = bookState;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
