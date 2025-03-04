package org.example;



public class Order {
    private String orderId;
    private String status;
    private String stockId;
    private int quantity;
    private double price;

    public Order(String orderId, String status, String stockId, int quantity) {
        this.orderId = orderId;
        this.status = status;
        this.stockId = stockId;
        this.quantity = quantity;
        this.price = price;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getStatus() {
        return status;
    }
    public String getStockId() {
        return stockId;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
