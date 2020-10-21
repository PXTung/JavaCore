package module.person;

public class Reader extends Person {

	private String readerId;
	private String readerType;
	private String readerPhone;
	private String readerEmail;

	public Reader() {
	}

	public Reader(String readerId) {
		this.readerId = readerId;
	}

	public Reader(Person person, String readerId,
				  String readerType, String readerPhone,
				  String readerEmail) {
		super(person.getPerId(), person.getFullName(),
				person.getAddress(), person.getDob(), person.getSex());
		this.readerId = readerId;
		this.readerType = readerType;
		this.readerPhone = readerPhone;
		this.readerEmail = readerEmail;
	}

	public String getReaderId() {
		return readerId;
	}

	public void setReaderId(String readerId) {
		this.readerId = readerId;
	}

	public String getReaderType() {
		return readerType;
	}

	public void setReaderType(String readerType) {
		this.readerType = readerType;
	}

	public String getReaderPhone() {
		return readerPhone;
	}

	public void setReaderPhone(String readerPhone) {
		this.readerPhone = readerPhone;
	}

	public String getReaderEmail() {
		return readerEmail;
	}

	public void setReaderEmail(String readerEmail) {
		this.readerEmail = readerEmail;
	}

	@Override
	public String toString() {
		return "Reader{" +
				"readerId='" + readerId + '\'' +
				", readerType='" + readerType + '\'' +
				", readerPhone='" + readerPhone + '\'' +
				", readerEmail='" + readerEmail + '\'' +
				'}' + super.toString();
	}
}