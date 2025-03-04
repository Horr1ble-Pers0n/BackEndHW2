package org.example;

public class Item {
    String name;
    String id;
    int amount;
    int price;

    Item(String name, String id, int amount, int price) {
        this.name = name;
        this.id = id;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public int getAmount() {
        return amount;
    }
    public int getPrice() {
        return price;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
