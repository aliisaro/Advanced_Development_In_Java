package Module6_GUIAndEventDrivenProgramming.Part2_CurrencyConverter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrencyView extends Application {
    private CurrencyController controller;
    public void start(Stage window) {
        // Initialize controller
        controller = new CurrencyController();

        // Layout
        VBox root = new VBox();
        root.setSpacing(10);

        Label title1 = new Label("Choose the currency to convert: ");
        ChoiceBox<String> from = new ChoiceBox<>();
        from.getItems().addAll("EUR", "USD", "GBP", "JPY", "SEK");

        Label title2 = new Label("Choose the currency to convert to: ");
        ChoiceBox<String> to = new ChoiceBox<>();
        to.getItems().addAll("EUR", "USD", "GBP", "JPY", "SEK");

        Label toConvert = new Label("Amount to convert: ");
        TextField input = new TextField();

        Label converted = new Label("Converted amount: ");
        TextField output = new TextField();

        Label errorField = new Label();
        errorField.setStyle("-fx-text-fill: red;");

        Button convert = new Button("Convert");
        convert.setOnAction(event -> controller.convert(input.getText(), from.getValue(), to.getValue(), output, errorField));

        // Add all elements to root
        root.getChildren().addAll(title1, from, title2, to, toConvert, input, converted, output, errorField, convert);

        // Scene
        Scene view = new Scene(root, 410,  400);

        view.getStylesheets().add("Module6Part2.css");

        // Stage
        window.setTitle("Currency Converter");
        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
