package Model;

import Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// класс для создания БД студентов в виде HashMap
public class HashModel implements iGetModel {
    private HashMap<Long, Student> studentHashMap;
    public HashModel(HashMap<Long, Student> studentHash){
        this.studentHashMap = studentHash;
    }

    // метод получения списка студентов из HashMap
    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        for (Student st: studentHashMap.values()){
            studentList.add(st);
        }
        return studentList; // возращает список студентов
    }

    // метод удаления студента из БД
    @Override
    public boolean deleteStudent(String id) {
        long key = Long.parseLong(id);
        if (studentHashMap.containsKey(key)){ // проверка на наличие номера студента в БД
            studentHashMap.remove(key); // удаление студента
            return true; // возврат успешности операции
        }
        return false; // возврат неудачи операции
    }
}
