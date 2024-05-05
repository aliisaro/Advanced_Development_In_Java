package Module6_GUIAndEventDrivenProgramming.Part2_CurrencyConverter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyModel {
    // Properties
    private Map<String, Double> exchangeRates;

    // Constructor
    public CurrencyModel() {
        // Initialize exchange rates
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("SEK", 8.5);
    }

    // Method to convert currency
    public double convert(double amount, String fromCurrency, String toCurrency) {
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);
        return amount * (toRate / fromRate);
    }
}
