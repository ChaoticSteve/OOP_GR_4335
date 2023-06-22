package View;

import Controller.iGetView;
import Model.Person;
import Model.Student;

import java.util.List;
import java.util.Scanner;

public class View implements iGetView {
    @Override
    public void printAllStudents(List<Student> students){
        System.out.println("-----Вывод списка студентов-----");
        int i = 1;
        for (Person s: students) {
            System.out.printf("%d %s\n", i++, s.toString());
        }
        System.out.println("-----Конец списка-----");
    }
    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public String exitMessage() {
        return "Выход из программы!";
    }

    @Override
    public String userRequest() {
        return "Введите команду:";
    }

    @Override
    public String deleteSuccess() {
        return "Удаление прошло успешно!";
    }

    @Override
    public String deleteNotSuccess() {
        return "Студента с данным номером нет!";
    }

    @Override
    public String chooseStudent() {
        return "Номер студента:";
    }
}
