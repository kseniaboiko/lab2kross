import java.lang.ref.WeakReference;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
       // ArrayList<Student> model  = retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();
        Model model = new Model();
        StudentController controller = new StudentController(model,view);
        view.controller = new WeakReference<>(controller);
        //controller.updateView();
        //controller.read();
        //view.readAnswer();
        controller.readConsole();

        //update model data
        //controller.setStudentName("John");

        //controller.updateView();
    }

    /*private static ArrayList<Student> retriveStudentFromDatabase(){


        ArrayList<Student> studentList = new ArrayList<>();
        Student student = new Student("hhrhr","jjjj");
        //student.setName("Robert");
        //student.setRollNo("10");
        studentList.add(student);

        return studentList;
    }*/
}
