package module;

public class Employee extends Person {
    private String empId;
    private String position;
    private int shift;

    public Employee(String empId) {
        this.empId = empId;
    }

    public Employee(Person person, String empId,
                    String position, int shift) {
        super(person.getPerId(), person.getFullName(),
            person.getAddress(), person.getDob(), person.getSex());
        this.empId = empId;
        this.position = position;
        this.shift = shift;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", position='" + position + '\'' +
                ", shift=" + shift +
                '}' + super.toString();
    }
}
