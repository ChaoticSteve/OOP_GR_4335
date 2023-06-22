package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;
// класс для взаимодействия с View и Model
public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    // метод получающий студентов из Model
    public void getAllStudents() {
        students = model.getAllStudents();
    }

    // метод проверяющий, что список студентов не пуст
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    // метод взаимодействия с Controller
    public void update() {
        //MVP
        getAllStudents();
        if(testData())
        {
            view.printAllStudents(students); // выводит список студентво, если есть
        }
        else{
            System.out.println("Список студентов пуст!"); // пишет, что студентов нет
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    // метод работы с Controller
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true; // переменная-флаг для запуска цикла
        while(getNewIteration)
        {
            String command = view.prompt(view.userRequest()); // запрос от пользователя
            com = Commands.valueOf(command.toUpperCase()); // переводим запрос в врехний регистр
            switch(com)
            {
                case EXIT:
                    getNewIteration=false; // смена значения флага
                    System.out.println(view.exitMessage()); // вывод сообщения о выходе
                    break;
                case LIST:
                    getAllStudents(); // вызов метода для получения списка студентов
                    view.printAllStudents(students); // вывод студентов через нужный View
                    break;
                case DELETE:
                    String id = view.prompt(view.chooseStudent()); // запрос номера студнета на удаление
                    if (model.deleteStudent(id)){ // проверка на успешное удаление
                        System.out.println(view.deleteSuccess());} // вывод сообщения об удалении
                    else {
                        System.out.println(view.deleteNotSuccess());} // вывод сообщения об отстутсвии студента
                    break;

            }

        }
    }

}