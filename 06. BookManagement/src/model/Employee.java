package model;

public class Employee extends Person {
    private String empId;
    private String empPosition;
    private int empShift;

    public Employee() {
    }

    public Employee(String perId, String perName,
                    String perAddress, String perDob, String perGender,
                    String empId, String empPosition, int empShift) {
        super(perId, perName, perAddress, perDob, perGender);
        this.empId = empId;
        this.empPosition = empPosition;
        this.empShift = empShift;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public int getEmpShift() {
        return empShift;
    }

    public void setEmpShift(int empShift) {
        this.empShift = empShift;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empPosition='" + empPosition + '\'' +
                ", empShift=" + empShift +
                '}' + super.toString();
    }
}
