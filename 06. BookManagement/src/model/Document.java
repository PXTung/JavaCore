package model;

public class Document {
    private String docName;
    private String docAuthor;
    private int docPYear;
    private int docQuantity;

    public Document() {
    }

    public Document(String docName,
                    String docAuthor, int docPYear, int docQuantity) {
        this.docName = docName;
        this.docAuthor = docAuthor;
        this.docPYear = docPYear;
        this.docQuantity = docQuantity;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocAuthor() {
        return docAuthor;
    }

    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    public int getDocPYear() {
        return docPYear;
    }

    public void setDocPYear(int docPYear) {
        this.docPYear = docPYear;
    }

    public int getDocQuantity() {
        return docQuantity;
    }

    public void setDocQuantity(int docQuantity) {
        this.docQuantity = docQuantity;
    }

    @Override
    public String toString() {
        return "Document{" +
                "docName='" + docName + '\'' +
                ", docAuthor='" + docAuthor + '\'' +
                ", docPYear='" + docPYear + '\'' +
                ", docQuantity=" + docQuantity +
                '}';
    }
}
