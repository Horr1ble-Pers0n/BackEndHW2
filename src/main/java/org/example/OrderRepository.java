package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public OrderRepository() {
        System.out.println("OrderRepository Created");
    }

    public void svOrder(String orderId, String Status) {
        System.out.println("Order " + orderId + " saved to database. Status: " + Status);
    }
    public void rmOrder(String orderId) {
        System.out.println("Order " + orderId + " removed from database.");
    }

    public void chStatus(String orderId , String Status) {
        System.out.println("Order " + orderId + " changed status to " + Status);
    }



}
