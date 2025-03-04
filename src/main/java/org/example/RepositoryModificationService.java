package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class RepositoryModificationService extends OrderRepository {
    public RepositoryModificationService() {
        System.out.println("Repository Modification Service Created");
    }

    public void rmOrder(String orderId) {
        System.out.println("Order " + orderId + " removed from database.");
    }

    public void chStatus(String orderId , String Status) {
        System.out.println("Order " + orderId + " changed status to " + Status);
    }
}
