import java.util.ArrayList;

public class Model {
    ArrayList<Student> studentList = new ArrayList<>();
    public  ArrayList<Student> retriveStudentFromDatabase(){
        //ArrayList<Student> studentList = new ArrayList<>();
        Student student = new Student("hhrhr","jjjj");
        //student.setName("Robert");
        //student.setRollNo("10");
        studentList.add(student);

        return studentList;
    }

    public void update(Student student){
        studentList.add(student);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}
