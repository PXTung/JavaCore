package module;

import module.Person;

public class Employee extends Person {

	private String empId;
	private String position;
	private int shift;

	public Employee() {
		// TODO - implement Employee.Employee
		throw new UnsupportedOperationException();
	}

	public Employee(String perId, String fullName,
					String address, String dob, String sex,
					String empId, String position, int shift) {
		super(perId, fullName, address, dob, sex);
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
				'}';
	}
}