package StudentService;

import StudentDomen.PersonComparator;
import StudentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private static int count;
    private List<Student> students;
    public StudentService(){
        this.students = new ArrayList<>();
    }
    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }
    public List<Student> getSortedByFIOStudentsList(){
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new PersonComparator<Student>());
        return newStudList;
    }
}