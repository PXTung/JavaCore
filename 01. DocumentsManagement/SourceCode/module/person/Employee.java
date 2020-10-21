package module.person;

public class Employee extends Person {

	private String empId;
	private String empPosition;
	private int empShift;

	public Employee() {
	}

	public Employee(String empId) {
		this.empId = empId;
	}

	public Employee(Person person, String empId,
					String empPosition, int empShift) {
		super(person.getPerId(), person.getFullName(),
				person.getAddress(), person.getDob(), person.getSex());
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