import Model.*;
import View.*;
import Controller.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Artem", "Petrov", 25, 01);
        Student s2 = new Student("Petr", "Artemov", 23, 02);
        Student s3 = new Student("Oleg", "Ivanov", 20, 03);
        //List<Student> studentList = new ArrayList<>();
        //studentList.add(s1);
        //studentList.add(s2);
        //studentList.add(s3);
        HashMap<Long, Student> studentHash = new HashMap<>();
        studentHash.put((long)(1), s1);
        studentHash.put((long)(2), s2);
        studentHash.put((long)(3), s3);
        iGetModel model = new HashModel(studentHash);
        //iGetModel model = new Model(studentList);
        //FileModel model = new FileModel("StudentsDB.txt");
        //model.saveAllStudentToFile(studentList);
        Controller controller = new Controller(chooseView(), model);
        //controller.update();
        controller.run();
        //System.out.println(model.getAllStudents());
    }

    //метод для выбора языка интерфейса
    private static iGetView chooseView(){
        Scanner in = new Scanner(System.in);
        System.out.print("Choose language/Выбери язык(english/русский):");
        String choose = in.nextLine();
        if (choose.equals("русский")){return new View();} // возвращает русский View
        return new EngView(); // возращает английский View
    }
    /**
     * реализовал данный метод здесь
     * т.к. считаю,
     * что приложение при первом запуске должно решать какой язык отобразить
     * Если логика не верна, прошу рассказать почему
     * Можно написать в Telegram t.me/chaoticsteve
     * */
}