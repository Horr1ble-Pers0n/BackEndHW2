package org.example;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void placeOrder(String orderId) {
        System.out.println("Order " + orderId + " placed.");
    }
    public void removeOrder(String orderId) {
        System.out.println("Order " + orderId + " removed.");
    }
}
