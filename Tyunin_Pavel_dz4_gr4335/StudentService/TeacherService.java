package StudentService;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService{
    private static int count;
    private List<Teacher> teachers;
    public TeacherService(){
        this.teachers = new ArrayList<>();
    }
    @Override
    public List getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, "PHD");
        count++;
        teachers.add(per);

    }
    public List<Teacher> getSortedByFIOTeachersList(){
        List<Teacher> newTeachList = new ArrayList<Teacher>(teachers);
        newTeachList.sort(new PersonComparator<Teacher>());
        return newTeachList;
    }
}
