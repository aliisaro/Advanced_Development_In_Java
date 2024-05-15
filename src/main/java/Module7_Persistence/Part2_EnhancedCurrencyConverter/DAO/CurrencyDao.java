package Module7_Persistence.Part2_EnhancedCurrencyConverter.DAO;

import Module7_Persistence.Part2_EnhancedCurrencyConverter.Datasource.MariaDbConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class CurrencyDao {
    // Method to retrieve exchange rate by currency abbreviation
    public static double getExchangeRate(String currency) {
        double exchangeRate = 0.0;

        try (Connection connection = MariaDbConnection.getConnection();
             var preparedStatement = connection.prepareStatement(
                     "SELECT exchangeRate FROM CURRENCY WHERE currencyName = ?");
        ) {
            preparedStatement.setString(1, currency);

            try (var resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    exchangeRate = resultSet.getDouble("exchangeRate");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exchangeRate;
    }

    public static void main(String[] args) {
        // Test retrieving exchange rate for a currency abbreviation
        double exchangeRateUSD = getExchangeRate("USD");
        System.out.println("Exchange rate for USD: " + exchangeRateUSD);
    }
}
