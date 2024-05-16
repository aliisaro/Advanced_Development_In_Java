package Module7_Persistence.Part3_JPA_CurrencyConverter.Controller;

import Module7_Persistence.Part3_JPA_CurrencyConverter.DAO.CurrencyDao;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    // Properties
    private CurrencyDao currencyDao;

    // Constructor
    public Controller() {
        this.currencyDao = new CurrencyDao();
    }

    // Method to retrieve exchange rate by currency abbreviation
    public double getExchangeRate(String currency) {
        return currencyDao.getExchangeRate(currency);
    }

    // Method to convert currency
    public void convert(String amountStr, String fromCurrency, String toCurrency, TextField output, Label errorField) {
        if (amountStr.isEmpty() || fromCurrency == null || toCurrency == null) {
            errorField.setText("Error: please choose currencies from both dropdown menus \nand enter an amount to convert.");
        } else {
            try {
                double amount = Double.parseDouble(amountStr);
                double exchangeRate = getExchangeRate(fromCurrency);
                if (exchangeRate == -1.0) {
                    errorField.setText("Error: Failed to retrieve exchange rate from the database.");
                } else {
                    double result = amount * exchangeRate;
                    output.setText(String.format("%.2f", result));
                    errorField.setText(""); // Clear error message if conversion succeeds
                }
            } catch (NumberFormatException e) {
                errorField.setText("Please enter an amount to convert in number format.");
            }
        }
    }

    public void addCurrency(String name, double rate) {
        currencyDao.addCurrency(name, rate);
    }
}
