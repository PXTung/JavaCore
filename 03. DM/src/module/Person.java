package module;

public class Person {
    private String perId;
    private String fullName;
    private String address;
    private String dob;
    private String sex;

    public Person() {
    }

    public Person(String perId, String fullName,
          String address, String dob, String sex) {
        this.perId = perId;
        this.fullName = fullName;
        this.address = address;
        this.dob = dob;
        this.sex = sex;
    }

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "perId='" + perId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
