package Module7_Persistence.Part3_JPA_CurrencyConverter.DAO;

import Module7_Persistence.Part3_JPA_CurrencyConverter.Entity.ExchangeRate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CurrencyDao {
    private EntityManagerFactory entityManagerFactory;

    public CurrencyDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
    }

    public double getExchangeRate(String currencyName) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        ExchangeRate exchangeRate = entityManager.find(ExchangeRate.class, currencyName);
        entityManager.close();

        return exchangeRate != null ? exchangeRate.getRate() : 0.0;
    }

    public void addCurrency(String currencyName, double exchangeRate) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        ExchangeRate newExchangeRate = new ExchangeRate(currencyName, exchangeRate); // Use exchangeRate instead of rate
        entityManager.persist(newExchangeRate);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
