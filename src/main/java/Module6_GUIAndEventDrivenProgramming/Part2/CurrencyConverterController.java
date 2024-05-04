package Module6_GUIAndEventDrivenProgramming.Part2;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CurrencyConverterController {
    // Properties
    private TextField amountField;
    private TextField resultField;
    private Label errorField;
    private CurrencyConverterModel model;

    // Constructor
    public CurrencyConverterController() {
        this.model = new CurrencyConverterModel();
    }

    // Method to convert currency
    public void convert(String amountStr, String fromCurrency, String toCurrency, TextField output, Label errorField) {
        if (amountStr.isEmpty() || fromCurrency == null || toCurrency == null) {
            errorField.setText("Error: please choose currencies from both dropdown menus \nand enter an amount to convert.");
        } else {
            try {
                double amount = Double.parseDouble(amountStr);
                double result = model.convert(amount, fromCurrency, toCurrency);
                output.setText(String.format("%.2f", result));
            } catch (NumberFormatException e) {
                errorField.setText("Please enter an amount to convert in number format.");
            }
        }
    }
}
