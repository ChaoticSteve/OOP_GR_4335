package Model;

import Controller.iGetModel;

import java.util.List;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public boolean deleteStudent(String id) {
        int i = Integer.parseInt(id) - 1;
        if (i >= 0) {
            if (i <= (students.size() - 1)) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}
