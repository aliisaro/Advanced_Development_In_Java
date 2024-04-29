package Module6_GUIAndEventDrivenProgramming.Part1.Task1_VirtualDictionary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controller;

    public void start(Stage window) {
        // Initialize the controller
        controller = new DictionaryController();

        // Create UI components
        Label meaningLabel = new Label("Welcome to the dictionary!\n Search for a word:\n");
        TextField wordTextField = new TextField();
        Button searchButton = new Button("Search");


        // Event handler for the search button
        searchButton.setOnAction(event -> {
            String word = wordTextField.getText().trim();
            String meaning = controller.searchWord(word);
            meaningLabel.setText(meaning);
        });

        // Layout
        VBox root = new VBox();
        root.getChildren().addAll( meaningLabel, wordTextField, searchButton);

        // Scene
        Scene scene = new Scene(root, 300, 100);

        // Stage
        window.setTitle("Virtual Dictionary");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
