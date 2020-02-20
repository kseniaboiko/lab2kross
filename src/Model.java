import java.util.ArrayList;

public class Model {

    ArrayList<Student> studentList = new ArrayList<>();
    public  ArrayList<Student> retriveStudentFromDatabase(){
        //Student student = new Student("hhrhr","jjjj");
        //studentList.add(student);
        return studentList;
    }

    public void update(Student student){
        studentList.add(student);
    }

    /*public ArrayList<Student> getStudentList() {
        return studentList;
    }*/
}
