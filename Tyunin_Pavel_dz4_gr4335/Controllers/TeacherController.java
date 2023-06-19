package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService dataTeacher = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataTeacher.create(firstName, secondName, age);
    }
}
