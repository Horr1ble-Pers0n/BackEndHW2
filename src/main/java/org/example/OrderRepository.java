package org.example;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class OrderRepository {

    private ArrayList<Order> orders;

    public OrderRepository() {
        this.orders = new ArrayList<>();
        System.out.println("Order Repository Created");
    }

    public void svOrder(Order order) {
        orders.add(order);
        System.out.println("Order " + order.getOrderId() + " saved to database. Status: " + order.getStatus());
    }
    public void rmOrder(Order order) {
        orders.remove(order);
        System.out.println("Order " + order.getOrderId() + " removed from database.");
    }

    public void chStatus(Order order, String Status) {
        order.setStatus(Status);
        System.out.println("Order " + order.getOrderId() + " changed status to " + Status);
    }



}
