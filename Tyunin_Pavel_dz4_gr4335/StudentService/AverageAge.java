package StudentService;

import StudentDomen.Person;

import java.util.List;

public class AverageAge<T extends Person>{
    public double meanAge(List<T> persons){
        double average = 0;
        for (T person: persons){
            average += person.getAge();
        }
        return average / persons.size();
    }
}



