package module;

public class Document {
    private String name;
    private String author;
    private int publishYear;
    private int quantity;

    public Document() {
    }

    public Document(String name, String author,
                    int publishYear, int quantity) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", quantity=" + quantity +
                '}';
    }
}
