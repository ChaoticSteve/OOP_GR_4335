package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private int idGroup;

    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (Student s: group){
            st.append("\t" + s + "\n");
        }
        return "StudentGroup{\n" +
                "idGroup: " + idGroup +
                "\nGroupSize: " + group.size() +
                "\nGroup:\n" + st +
                "}";
    }

    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < group.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return group.get(counter++);
            }
        };
    }


    @Override
    public int compareTo(StudentGroup o) {
        if(this.getGroup().size()==o.getGroup().size())
        {
            if(this.getIdGroup()==o.getIdGroup())
            {
                return 0;
            }
            if(this.getIdGroup()<o.getIdGroup())
            {
                return -1;
            }
            return 1;
        }
        if(this.getGroup().size()<o.getGroup().size())
        {
            return -1;
        }
        return 1;
    }
}