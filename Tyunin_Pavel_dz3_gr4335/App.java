import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args){
        Student s1 = new Student("Artem", "Petrov", 25, 01);
        Student s2 = new Student("Petr", "Artemov", 23, 02);
        Student s3 = new Student("Oleg", "Ivanov", 20, 03);
        //Student s7 = new Student("Misha", "Gavrilov", 24, 07);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        //listStud.add(s7);

        StudentGroup group11 = new StudentGroup(listStud, 11);
        Collections.sort(group11.getGroup());

        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(group11);

        Student s4 = new Student("Ivan", "Sidorov", 20, 04);
        Student s5 = new Student("Artur", "Pavlov", 23, 05);
        Student s6 = new Student("Evegeniy", "Novikov", 24, 06);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);

        StudentGroup group22 = new StudentGroup(listStud2, 22);
        Collections.sort(group22.getGroup());
        listGroup.add(group22);
        StudentStream stream1 = new StudentStream(listGroup, 01);
        Collections.sort(stream1.getGroupsStream());

        for (StudentGroup sg : stream1){
            System.out.println(sg);
        }
        //System.out.println(stream1);
    }

}