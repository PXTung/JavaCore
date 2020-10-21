package model;

public class ReaderModel extends PersonModel{
    private String redId;
    private String redType;
    private String redNumber;
    private String redEmail;

    public ReaderModel() {
    }

    public ReaderModel(String redId, String redType,
                       String redNumber, String redEmail) {
        this.redId = redId;
        this.redType = redType;
        this.redNumber = redNumber;
        this.redEmail = redEmail;
    }

    public ReaderModel(PersonModel person, String redId,
                       String redType,  String redNumber, String redEmail) {
        super(person.getPerId(), person.getPerName(),  person.getPerAddress(),
                person.getPerDob(), person.getPerGender());
        this.redId = redId;
        this.redType = redType;
        this.redNumber = redNumber;
        this.redEmail = redEmail;
    }

    public String getRedId() {
        return redId;
    }

    public void setRedId(String redId) {
        this.redId = redId;
    }

    public String getRedType() {
        return redType;
    }

    public void setRedType(String redType) {
        this.redType = redType;
    }

    public String getRedNumber() {
        return redNumber;
    }

    public void setRedNumber(String redNumber) {
        this.redNumber = redNumber;
    }

    public String getRedEmail() {
        return redEmail;
    }

    public void setRedEmail(String redEmail) {
        this.redEmail = redEmail;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "redId='" + redId + '\'' +
                ", redType='" + redType + '\'' +
                ", redNumber='" + redNumber + '\'' +
                ", redEmail='" + redEmail + '\'' +
                '}' + super.toString();
    }
}
