package model;

public class PersonModel {
    private String perId;
    private String perName;
    private String perAddress;
    private String perDob;
    private String perGender;

    public PersonModel() {
    }

    public PersonModel(String perId, String perName,
                       String perAddress, String perDob, String perGender) {
        this.perId = perId;
        this.perName = perName;
        this.perAddress = perAddress;
        this.perDob = perDob;
        this.perGender = perGender;
    }

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPerAddress() {
        return perAddress;
    }

    public void setPerAddress(String perAddress) {
        this.perAddress = perAddress;
    }

    public String getPerDob() {
        return perDob;
    }

    public void setPerDob(String perDob) {
        this.perDob = perDob;
    }

    public String getPerGender() {
        return perGender;
    }

    public void setPerGender(String perGender) {
        this.perGender = perGender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "perId='" + perId + '\'' +
                ", perName='" + perName + '\'' +
                ", perAddress='" + perAddress + '\'' +
                ", perDob='" + perDob + '\'' +
                ", perGender='" + perGender + '\'' +
                '}';
    }
}
