import java.lang.ref.WeakReference;

public class MVCPatternDemo {
    public static void main(String[] args) {

        StudentView view = new StudentView();
        Model model = new Model();
        StudentController controller = new StudentController(model,view);
        view.controller = new WeakReference<>(controller);
        controller.readConsole();
    }
}
