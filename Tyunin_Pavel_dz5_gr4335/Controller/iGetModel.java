package Controller;
import Model.Student;

import java.util.List;

// интерфейс с базовыми методами для всех Model
public interface iGetModel {
    List<Student> getAllStudents(); // получение списка студентов
    boolean deleteStudent(String id); // удаление студента из БД
}
