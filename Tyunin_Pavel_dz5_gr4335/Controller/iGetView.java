package Controller;

import Model.Student;

import java.util.List;

// интерфейс с базовыми методам для все View
public interface iGetView {
    void printAllStudents(List<Student> students); // печать всех студентов
    String prompt(String message); // запрос от пользователя
    String exitMessage(); // сообщение о выходе
    String userRequest(); // сообщение о запросе
    String deleteSuccess(); // сообщение об успешном удалении
    String deleteNotSuccess(); // сообщение о неудачном удалении
    String chooseStudent(); // сообщение о выборе студента
}
