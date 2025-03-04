package org.example;

public class SingletonTax {
    private static SingletonTax instance;

    private double tax;

    private SingletonTax() {
        this.tax = 1.2;
    }

    public double getTax() {
        return tax;
    }


    public static SingletonTax getInstance() {
        if (instance == null) {
            instance = new SingletonTax();
        }
        return instance;
    }

}
