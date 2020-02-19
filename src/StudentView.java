import java.lang.ref.WeakReference;
import java.util.Scanner;

public class StudentView {

    public WeakReference<StudentController> controller = new WeakReference<>(null);

    public void readAnswer(){
        Scanner in = new Scanner(System.in);
        System.out.print("Read or enter?: ");
        String answer = in.nextLine();
        controller.get().notifyUser(answer);
    }
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
    public void readStudentDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student name ");
        String name = in.nextLine();
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter student another value ");
        String anotherValue = in1.nextLine();
        controller.get().createUser(name, anotherValue);
    }

    public void incorrectEnter(){
        
    }

}

