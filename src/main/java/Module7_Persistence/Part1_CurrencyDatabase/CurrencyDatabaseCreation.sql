DROP DATABASE IF EXISTS CurrencyDatabase;
CREATE DATABASE CurrencyDatabase;
USE CurrencyDatabase;

CREATE TABLE CURRENCY (
    id INT NOT NULL AUTO_INCREMENT,
	 currencyName VARCHAR(10) NOT NULL,
    exchangeRate DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO CURRENCY (currencyName, exchangeRate) VALUES
	('EUR', 1.00),
   ('USD', 1.18),
   ('GBP', 0.85),
   ('JPY', 132.17),
   ('SEK', 10.00),
   ('AUD', 1.62),
   ('CAD', 1.49),
   ('CHF', 1.08),
   ('NZD', 1.71);
   
DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';

GRANT SELECT, INSERT, UPDATE, DELETE ON CurrencyDatabase.* TO 'appuser'@'localhost';


    
