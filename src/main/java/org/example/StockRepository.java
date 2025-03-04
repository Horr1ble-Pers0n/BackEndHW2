package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public class StockRepository {
    protected ArrayList<Item> Items;

    public StockRepository(ArrayList<Item> items) {
        this.Items = items;
        System.out.println("Stock Repository Created");
    }

    public StockRepository() {
        this.Items = new ArrayList<>();
        System.out.println("Stock Repository Created");
    }
}
