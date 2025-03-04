package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class StockService extends StockRepository{
    StockService() {
        System.out.println("StockService created");
    }

    public void printStock(StockRepository StockRepository){
        System.out.println("Items in stock:");
        for (var item : StockRepository.getItems()){
            System.out.println(item.getName() + " " + item.getAmount());
        }

    }
}
