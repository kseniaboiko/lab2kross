import java.util.ArrayList;

public class StudentController {
    private Model model;
    private StudentView view;



    public StudentController(Model model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void update(String name, String rollNo){
        Student student = new Student(rollNo, name);
        model.update(student);
    }
    public void read(){
        ArrayList<Student> list = model.retriveStudentFromDatabase();
        for(Student l:list){
            view.printStudentDetails(l.getName(), l. getRollNo());
        }

    }
    public void readConsole(){
        view.readAnswer();
    }
    public void notifyUser(String answer){
        //
        System.out.println(answer);
        String read = "Read";
        if(answer.equals(read)){
            read();
        }

        else {
            view.readStudentDetails();
        }
    }

    public void createUser(String name, String anotherValue) {
        Student newStudent = new Student(anotherValue,name);
        model.update(newStudent);
        view.readAnswer();
    }
}