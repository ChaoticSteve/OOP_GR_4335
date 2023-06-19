import Controllers.TeacherController;
import StudentDomen.*;
import StudentService.*;

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

        //for (StudentGroup sg : stream1){
            //System.out.println(sg);
        //}
        //System.out.println(stream1);
        //PersonComparator<Person> comp = new PersonComparator<>();
        //comp.compare(s1, new Teacher("a", "b", 15, "PHD"));

        //AverageAge<Student> average = new AverageAge<>();
        //System.out.println(average.meanAge(group11.getGroup()));
        TeacherService sv = new TeacherService();
        sv.create("Ivan", "Sidorov", 33);
        sv.create("Artur", "Pavlov", 34);
        sv.create("Artem", "Petrov", 29);
        //System.out.println(sv.getSortedByFIOTeachersList());

    }

}