package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService extends OrderRepository{

    OrderService() {
        super();
        System.out.println("OrderService created");
    }
    OrderService(ArrayList<Order> orders) {
        super(orders);
        System.out.println("OrderService created and populated with orders");
    }

    public void printOrder(Order order){
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

    public void makeOrder(Order order, StockService repo){
        this.svOrder(order);
        for( var item : order.getItems()){
            if(repo.getItem(item.getId()) != null) {
                Item item_repo = repo.getItem(item.getId());
                if( item_repo.getAmount() >= item.getAmount() ){
                    order.addItem(item);
                }
                else{
                    this.chStatus(order, "Pending delivery");
                    return;
                }
            }
            else{
                this.chStatus(order, "Pending delivery");
                return;
            }
            for (var i : order.getItems()) {
                for (var j : repo.getItems()) {
                    j.setAmount(j.getAmount() - i.getAmount());
                }

            }
            this.chStatus(order,"Completed");

        }
    }
}
