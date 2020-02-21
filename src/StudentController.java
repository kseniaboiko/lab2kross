import java.util.ArrayList;

public class StudentController {
    private Model model;
    private StudentView view;
    private StudentGUIView guiView;

    public StudentController(Model model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public StudentController(Model model, StudentGUIView guiView){
        this.model = model;
        this.guiView = guiView;
    }

   /* public void update(String name, String rollNo){
        Student student = new Student(rollNo, name);
        model.update(student);
    }*/
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

        String read = "Read";
        String enter = "Enter";
        if(!answer.equals(enter) && !answer.equals(read)) {
            view.incorrectEnter();
        }
        if(answer.equals(read)){
            read();
        }
        if(answer.equals(enter)){
            view.readStudentDetails();
        }
        readConsole();
    }

    public void createUser(String name, String anotherValue) {
        Student newStudent = new Student(anotherValue,name);
        model.update(newStudent);
        //view.readAnswer();
    }
}