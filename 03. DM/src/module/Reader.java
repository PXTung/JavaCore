package module;

public class Reader extends Person{
    private String readerId;
    private String readerType;
    private String phone;
    private String email;

    public Reader(String readerId) {
        this.readerId = readerId;
    }

    public Reader(Person person, String readerId,
                  String readerType, String phone, String email) {
        super(person.getPerId(), person.getFullName(),
            person.getAddress(), person.getDob(), person.getSex());
        this.readerId = readerId;
        this.readerType = readerType;
        this.phone = phone;
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId='" + readerId + '\'' +
                ", readerType='" + readerType + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}' + super.toString();
    }
}
