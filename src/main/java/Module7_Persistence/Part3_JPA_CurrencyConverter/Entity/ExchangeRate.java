package Module7_Persistence.Part3_JPA_CurrencyConverter.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeRate {
    @Id
    private String currencyName;
    private double rate;

    // Constructors, getters, setters
    public ExchangeRate() {
    }

    public ExchangeRate(String currencyName, double rate) {
        this.currencyName = currencyName;
        this.rate = rate;
    }

    // Getters and setters
    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
