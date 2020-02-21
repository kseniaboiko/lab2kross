import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.control.Button;

import java.awt.*;
import java.util.Collection;


public class StudentGUIView extends Application {
   // public WeakReference<StudentController> controller = new WeakReference<>(null);

    @Override
    public void start(Stage stage) throws Exception {

        // установка надписи
        //Text text = new Text("Read or enter");
        var textArea = new TextArea("Enter");

       /* text.setLayoutY(50);    // установка положения надписи по оси Y
        text.setLayoutX(0);   // установка положения надписи по оси X

        text1.setLayoutY(100);    // установка положения надписи по оси Y
        text1.setLayoutX(0);   // установка положения надписи по оси X
        Group group = new Group(text, text1);*/
        VBox vbox = new VBox(15);


        //cancelBtn.setMaxWidth(100);

        vbox.getChildren().addAll((Collection<? extends Node>) textArea);


        Scene scene = new Scene(vbox, 600, 600);
        stage.setScene(scene);

        stage.setTitle("Layout in JavaFX");

        stage.show();



    }

    public static void main(String args[]){
        Application.launch(args);
    }

}
