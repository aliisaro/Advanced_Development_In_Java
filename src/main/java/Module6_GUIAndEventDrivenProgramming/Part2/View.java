package Module6_GUIAndEventDrivenProgramming.Part2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class View extends Application {
    public void start(Stage window) {


        // Layout
        VBox root = new VBox();
        root.getChildren().addAll();

        // Scene
        Scene scene = new Scene(root, 300,  100);

        // Stage
        window.setTitle("Virtual Dictionary");
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
