package Controllers;

import StudentDomen.Employee;
import StudentDomen.PersonComparator;
import StudentService.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController implements iPersonController<Employee>{
    private EmployeeService dataEmployee = new EmployeeService();
    @Override
    public void create(String firstName, String secondName, int age) {
        dataEmployee.create(firstName, secondName, age);
    }
    static public <T extends Employee> void paySalary(T person)
    {
        System.out.println((person).getFirstName() + " выплачена зарплата 10000р.");
        //return person;
    }
}
