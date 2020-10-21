package model;

public class Book extends Document {
    private String bId;
    private String bType;

    public Book(Document document, String bId, String bType) {
        super(document.getDocName(), document.getDocAuthor(),
                document.getDocPYear(), document.getDocQuantity());
        this.bId = bId;
        this.bType = bType;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bId='" + bId + '\'' +
                ", bType='" + bType + '\'' +
                '}' + super.toString();
    }
}
