package module.document;

public class Document {

	private String docName;
	private String docAuthor;
	private int docPublish;
	private int docQuantity;

	public Document() {
	}

	public Document(String docName, String docAuthor,
					int docPublish, int docQuantity) {
		this.docName = docName;
		this.docAuthor = docAuthor;
		this.docPublish = docPublish;
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

	public int getDocPublish() {
		return docPublish;
	}

	public void setDocPublish(int docPublish) {
		this.docPublish = docPublish;
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
				", docPublish=" + docPublish +
				", docQuantity=" + docQuantity +
				'}';
	}
}