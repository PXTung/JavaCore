package module;

public class Reader extends Person {
    private String readerId;
    private String type;
    private String phone;
    private String email;

    public Reader(Person person, String readerId,
                  String type, String phone, String email) {
        super(person.getPerId(), person.getName(),
                person.getAddress(), person.getDob(), person.getSex());
        this.readerId = readerId;
        this.type = type;
        this.phone = phone;
        this.email = email;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                ", type='" + type + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}' + super.toString();
    }
}
