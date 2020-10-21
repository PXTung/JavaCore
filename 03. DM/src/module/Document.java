package module;

public class Document {
    private String docName;
    private String author;
    private int publishYear;
    private int quantity;

    public Document() {
    }

    public Document(String docName, String author,
                int publishYear, int quantity) {
        this.docName = docName;
        this.author = author;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
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
                "docName='" + docName + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", quantity=" + quantity +
                '}';
    }
}
