package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        StockService Stock = context.getBean(StockService.class);
        StockService globalStock = context.getBean("GlobalStockService", StockService.class);

        Stock.printStock();
        globalStock.printStock();

        OrderService localOrderService = context.getBean("LocalOrderService", OrderService.class);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("iPhone 1", "A001", 1, 80000));
        items.add(new Item("Samsung 2", "S002", 1, 60000));

        SingletonTax tax = SingletonTax.getInstance();

        Order order = new Order("ORD001", "Created", items, tax);

        localOrderService.makeOrder(order , Stock);

        System.out.println(order.getStatus());
    }
}