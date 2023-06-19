package StudentService;

import StudentDomen.Employee;
import StudentDomen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService {
    private static int count;
    private List<Employee> employees;
    public EmployeeService(){
        this.employees = new ArrayList<>();
    }
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Employee per = new Employee(firstName, secondName, age, "basic");
        count++;
        employees.add(per);
    }
    public List<Employee> getSortedByFIOEmploeeList()
    {
        List<Employee> newEmploiList = new ArrayList<Employee>(employees);
        newEmploiList.sort(new PersonComparator<Employee>());
        return newEmploiList;
    }
}

