package module;

public class Document {

	private String docId;
	private String author;
	private int publishYear;
	private int quantity;

	public Document() {
		// TODO - implement Document.Document
		throw new UnsupportedOperationException();
	}

	public Document(String docId, String author,
					int publishYear, int quantity) {
		this.docId = docId;
		this.author = author;
		this.publishYear = publishYear;
		this.quantity = quantity;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
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
				"docId='" + docId + '\'' +
				", author='" + author + '\'' +
				", publishYear=" + publishYear +
				", quantity=" + quantity +
				'}';
	}
}