package Module7_Persistence.Part2.Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Model {
    // Properties
    private Map<String, Double> exchangeRates;

    // Constructor
    public Model() {
        // Initialize exchange rates
        exchangeRates = new HashMap<>();
    }

    // Method to fetch exchange rates from the database
    public void fetchExchangeRatesFromDatabase(Connection connection) throws SQLException {
        String query = "SELECT currencyName, exchangeRate FROM CURRENCY";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String currencyName = rs.getString("currencyName");
                double exchangeRate = rs.getDouble("exchangeRate");
                exchangeRates.put(currencyName, exchangeRate);
            }
        }
    }

    // Method to convert currency
    public double convert(double amount, String fromCurrency, String toCurrency) {
        double fromRate = exchangeRates.getOrDefault(fromCurrency, 1.0);
        double toRate = exchangeRates.getOrDefault(toCurrency, 1.0);
        return amount * (toRate / fromRate);
    }
}
