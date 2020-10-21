package model;

public class EmployeeModel extends BaseModel{
    private String empId;
    private String empPosition;
    private int empShift;

    public EmployeeModel() {
    }

    public EmployeeModel(String empId, String empPosition, int empShift) {
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
                ", perId='" + super.getId() + '\'' +
                '}';
    }
}
