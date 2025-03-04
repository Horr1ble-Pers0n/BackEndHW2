package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public class StockRepository {
    private ArrayList<Item> Items;

    public StockRepository() {
        this.Items = new ArrayList<>();
        System.out.println("Stock Repository Created");
    }

    public void svItem(Item item) {
        Items.add(item);
        System.out.println("Item added to stock:" + item.getName());
    }

    public void rmItem(Item item) {
        Items.remove(item);
        System.out.println("Item removed from stock:" + item.getName());
    }

    public ArrayList<Item> getItems() {
        return Items;
    }
}
