package org.example;


import java.util.ArrayList;

public class Order {
    private String orderId;
    private String status;
    private ArrayList<Item> Items;
    private SingletonTax Tax;
    private final double totalPrice;

    public Order(String orderId, String status, ArrayList<Item> Items, SingletonTax Tax) {
        this.orderId = orderId;
        this.status = status;
        this.Items = Items;
        this.Tax = Tax;
        int price = 0;
        for (Item item : Items) {
            price += item.getPrice();
        }
        this.totalPrice = price*Tax.getTax();
    }
    public String getOrderId() {
        return orderId;
    }
    public String getStatus() {
        return status;
    }
    public ArrayList<Item> getItems() {
        return Items;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setItems(ArrayList<Item> items) {
        Items = items;
    }



}
