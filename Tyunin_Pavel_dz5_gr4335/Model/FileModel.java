package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class FileModel implements iGetModel {
    private String fileName;

    public FileModel(String fileName) {
        this.fileName = fileName;

        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<Student>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }
    // метод для очистки файла для последующей перезаписи
    private void clearAllStudents(){
        try (PrintWriter pw = new PrintWriter(fileName)){
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean deleteStudent(String id) {
        int i = Integer.parseInt(id) - 1;
        List<Student> students  = new ArrayList<Student>();
        students = this.getAllStudents();
        if (i >= 0) {
            if (i <= (students.size() - 1)) {
                students.remove(i);
                this.clearAllStudents();
                this.saveAllStudentToFile(students);
                return true;
            }
        }
        return false;
    }

    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
