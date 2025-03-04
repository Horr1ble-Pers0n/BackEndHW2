package org.example;

public class SingletonTax {
    private static SingletonTax instance;
    private final double taxRate = 1.2; // Example tax multiplier (10% tax)

    private SingletonTax() {}

    public static SingletonTax getInstance() {
        if (instance == null) {
            instance = new SingletonTax();
        }
        return instance;
    }

    public double getTax() {
        return taxRate;
    }
}
