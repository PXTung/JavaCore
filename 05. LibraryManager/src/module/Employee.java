package module;

public class Employee extends Person {
    private String empId;
    private String position;
    private int shift;

    public Employee(Person person, String empId,
                    String position, int shift) {
        super(person.getPerId(), person.getName(),
                person.getAddress(), person.getDob(), person.getSex());
        this.empId = empId;
        this.position = position;
        this.shift = shift;
    }
}
