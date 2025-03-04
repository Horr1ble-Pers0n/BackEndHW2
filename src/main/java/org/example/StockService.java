package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Lazy

public class StockService extends StockRepository{
    StockService() {
        super();
        System.out.println("StockService created");
    }
    StockService(ArrayList<Item> items) {
        super(items);
        System.out.println("StockService created and populated with items");
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

    public Item getItem(String id){
        for (var item : this.getItems()){
            if( item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }

    public void printStock(){
        System.out.println("Items in stock:");
        for (var item : this.getItems()){
            System.out.println(item.getName() + " " + item.getAmount());

        }

    }
}
