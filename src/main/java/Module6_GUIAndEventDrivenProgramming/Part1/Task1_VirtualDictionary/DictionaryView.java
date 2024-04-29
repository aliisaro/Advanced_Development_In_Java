package Module6_GUIAndEventDrivenProgramming.Part1.Task1_VirtualDictionary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller;

    @Override
    public void start(Stage primaryStage) {
        // Initialize the controller
        controller = new DictionaryController();

        // Create UI components
        TextField wordTextField = new TextField();
        Button searchButton = new Button("Search");
        Label meaningLabel = new Label();

        // Event handler for the search button
        searchButton.setOnAction(event -> {
            String word = wordTextField.getText().trim();
            if (!word.isEmpty()) {
                String meaning = controller.searchWord(word);
                if (meaning != null) {
                    meaningLabel.setText(meaning);
                } else {
                    meaningLabel.setText("Word not found in dictionary.");
                }
            } else {
                meaningLabel.setText("Please enter a word.");
            }
        });

        // Layout
        FlowPane root = new FlowPane();
        root.getChildren().addAll(wordTextField, searchButton, meaningLabel);

        // Scene
        Scene scene = new Scene(root, 300, 100);

        // Stage
        primaryStage.setTitle("Virtual Dictionary");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
