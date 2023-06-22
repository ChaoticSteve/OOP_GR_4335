package View;

import Controller.iGetView;
import Model.Person;
import Model.Student;

import java.util.List;
import java.util.Scanner;

// класс для вывода сообщений пользователю на английском
public class EngView implements iGetView {

    // метод вывода списка студентов
    @Override
    public void printAllStudents(List<Student> students){
        System.out.println("-----Displaying a list of students-----");
        int i = 1;
        for (Person s: students) {
            System.out.printf("%d %s\n", i++, s.toString());
        }
        System.out.println("-----End of list-----");
    }
    // метод запроса команды от пользователя
    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    // последующие методы возвращают нужную строку при вызове
    @Override
    public String exitMessage() {
        return "Exiting the program!";
    }

    @Override
    public String userRequest() {
        return "Enter command:";
    }

    @Override
    public String deleteSuccess() {
        return "Removal completed successfully!";
    }

    @Override
    public String deleteNotSuccess() {
        return "There is no student with this number!";
    }

    @Override
    public String chooseStudent() {
        return "Student number:";
    }
}
