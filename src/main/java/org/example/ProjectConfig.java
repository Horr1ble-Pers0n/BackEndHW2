package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.Collections;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean
    @Primary
    @Qualifier("LocalStockService")
    public StockService LocalStockService() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("iPhone 1", "A001", 10, 80000));
        items.add(new Item("iPhone 2", "A002", 10, 100000));
        items.add(new Item( "Samsung 1" , "S001" , 0 , 60000));
        items.add(new Item( "Samsung 2" , "S002" , 2 , 70000));
        return new StockService(items);
    }

    @Bean
    @Qualifier("GlobalStockService")
    public StockService GlobalStockService() {

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("iPhone 1", "A001", 999, 80000));
        items.add(new Item("iPhone 2", "A002", 999, 100000));
        items.add(new Item( "Samsung 1" , "S001" , 999 , 60000));
        items.add(new Item( "Samsung 2" , "S002" , 999 , 70000));

        return new StockService(items);
    }

    @Bean
    @Qualifier("LocalOrderService")
    public OrderService LocalOrderService() {
        return new OrderService();
    }

}
