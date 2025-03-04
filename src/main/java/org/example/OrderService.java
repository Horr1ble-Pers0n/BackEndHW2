package org.example;

import org.springframework.stereotype.Service;

@Service
public class OrderService extends OrderRepository{

    OrderService() {
        System.out.println("OrderService created");
    }

    public void printOrder(Order order){
        System.out.println("Order " + order.getOrderId() + " consists of: ");
        for (var item : order.getItems()) {
            System.out.println(item.getAmount() + " " + item.getName());
        }
    }

    public void makeOrder(Order order, StockRepository StockRepository){

    }
}
