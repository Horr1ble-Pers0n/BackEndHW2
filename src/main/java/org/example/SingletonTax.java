package org.example;

public class SingletonTax {
    private static SingletonTax instance;

    private int tax;

    private SingletonTax() {
        this.tax = 20;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public static SingletonTax getInstance() {
        if (instance == null) {
            instance = new SingletonTax();
        }
        return instance;
    }

}
