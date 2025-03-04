package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Lazy
@Service
public class OrderService extends OrderRepository {

    OrderService() {
        super();
        System.out.println("OrderService created");
    }

    OrderService(ArrayList<Order> orders) {
        super(orders);
        System.out.println("OrderService created and populated with orders");
    }

    public void printOrder(Order order) {
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

    public void makeOrder(Order order, StockService repo) {
        this.svOrder(order);
        ArrayList<Item> itemsToAdd = new ArrayList<>();

        for (var item : order.getItems()) {
            Item item_repo = repo.getItem(item.getId());

            if (item_repo != null) {
                if (item_repo.getAmount() >= item.getAmount()) {
                    itemsToAdd.add(item);
                } else {
                    this.chStatus(order, "Pending delivery");
                    return;
                }
            } else {
                this.chStatus(order, "Pending delivery");
                return;
            }
        }

        order.getItems().addAll(itemsToAdd);

        for (var i : order.getItems()) {
            for (var j : repo.getItems()) {
                if (j.getId().equals(i.getId())) {
                    j.setAmount(j.getAmount() - i.getAmount());
                }
            }
        }

        this.chStatus(order, "Completed, total price: " + order.getTotalPrice());
    }
}
