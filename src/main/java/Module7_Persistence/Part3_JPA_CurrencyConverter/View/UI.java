package Module7_Persistence.Part3_JPA_CurrencyConverter.View;

import Module7_Persistence.Part3_JPA_CurrencyConverter.Controller.Controller;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI extends javafx.application.Application {
    private Controller controller;

    public void start(Stage window) {
        // Initialize controller
        controller = new Controller();

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

        Button addButton = new Button("Add New Currency");
        addButton.setOnAction(event -> openAddCurrencyWindow());

        // Add all elements to root
        root.getChildren().addAll(title1, from, title2, to, toConvert, input, converted, output, errorField, convert, addButton);

        // Scene
        Scene view = new Scene(root, 410,  400);

        // Stage
        window.setTitle("Currency Converter (connected to MariaDB)");
        window.setScene(view);
        window.show();
    }

    private void openAddCurrencyWindow() {
        Stage addCurrencyStage = new Stage();

        Label nameLabel = new Label("Currency Name:");
        TextField nameField = new TextField();

        Label rateLabel = new Label("Exchange Rate:");
        TextField rateField = new TextField();

        Button addButton = new Button("Add");
        addButton.setOnAction(event -> {
            String name = nameField.getText();
            double rate = Double.parseDouble(rateField.getText());
            // Call the controller method to add the currency to the database
            controller.addCurrency(name, rate);
            addCurrencyStage.close(); // Close the window after adding the currency
        });

        VBox root = new VBox();
        root.getChildren().addAll(nameLabel, nameField, rateLabel, rateField, addButton);

        Scene scene = new Scene(root, 300, 200);
        addCurrencyStage.setScene(scene);
        addCurrencyStage.setTitle("Add New Currency");
        addCurrencyStage.showAndWait();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
