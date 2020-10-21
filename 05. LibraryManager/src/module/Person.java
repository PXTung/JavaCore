package module;

public class Person {
    private String perId;
    private String name;
    private String address;
    private String dob;
    private String sex;

    public Person() {
    }

    public Person(String perId, String name,
                  String address, String dob, String sex) {
        this.perId = perId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
