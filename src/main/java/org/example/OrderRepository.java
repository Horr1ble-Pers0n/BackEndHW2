package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Lazy
@Repository
public class OrderRepository {

    protected ArrayList<Order> orders;

    public OrderRepository(ArrayList<Order> orders) {
        this.orders = orders;
        System.out.println("Empty Order Repository Created");
    }

    public OrderRepository() {
        this.orders = new ArrayList<>();
        System.out.println("Populated Order Repository Created");
    }





}
