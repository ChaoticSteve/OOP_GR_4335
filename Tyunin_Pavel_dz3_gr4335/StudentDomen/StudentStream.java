package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> groupsStream;
    private long idStream;
    public StudentStream(List<StudentGroup> groups, long id){
        this.groupsStream = groups;
        this.idStream = id;
    }

    public List<StudentGroup> getGroupsStream() {
        return groupsStream;
    }

    public void setGroupsStream(List<StudentGroup> groupsStream) {
        this.groupsStream = groupsStream;
    }

    public long getIdStream() {
        return idStream;
    }

    public void setIdStream(long idStream) {
        this.idStream = idStream;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (StudentGroup sg: groupsStream){
            st.append("\t" + sg  + "\n");
        }
        return "StudentStream{\n" +
                "idStream: " + idStream +
                "\nsizeStream: " + groupsStream.size() +
                "\ngroupsStream:\n" + st +
                '}';
    }
    @Override
    public Iterator<StudentGroup> iterator() {

        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < groupsStream.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groupsStream.get(counter++);
            }
        };
    }
}
