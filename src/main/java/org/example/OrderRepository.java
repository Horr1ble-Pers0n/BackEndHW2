package org.example;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class OrderRepository {

    protected ArrayList<Order> orders;

    public OrderRepository(ArrayList<Order> orders) {
        this.orders = orders;
        System.out.println("Order Repository Created");
    }

    public OrderRepository() {
        this.orders = new ArrayList<>();
        System.out.println("Order Repository Created");
    }





}
