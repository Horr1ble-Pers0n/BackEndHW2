package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService extends OrderRepository{

    OrderService() {
        super();
        System.out.println("OrderService created");
    }
    OrderService(ArrayList<Order> orders) {
        super(orders);
        System.out.println("OrderService created and populated with orders");
    }

    public void printOrder(Order order){
        System.out.println("Order " + order.getOrderId() + " consists of: ");
        for (var item : order.getItems()) {
            System.out.println(item.getAmount() + " " + item.getName());
        }
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


    public void makeOrder(Order order, StockRepository StockRepository){

    }
}
