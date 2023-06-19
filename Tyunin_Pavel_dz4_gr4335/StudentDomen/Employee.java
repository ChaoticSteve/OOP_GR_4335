package StudentDomen;

public class Employee extends Person {
    private String special;
    public Employee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }
}
