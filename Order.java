package oop.lab.task.pkg3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private Date orderDate;
    private List<Garment> garments = new ArrayList<>();
    private double totalAmount;

    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void addGarment(Garment garment) {
        if (garment.getStockQuantity() > 0) {
            garments.add(garment);
            garment.setStockQuantity(garment.getStockQuantity() - 1);
        } else {
            System.out.println("Sorry, this garment is out of stock.");
        }
    }

    public double calculateTotalAmount() {
        totalAmount = 0;
        for (Garment g : garments) {
            totalAmount += g.getPrice();
        }
        return totalAmount;
    }

    public void printOrderDetails() {
        System.out.println("--------------------------");
        System.out.println("Order Details");
        System.out.println("--------------------------");
        for (Garment g : garments) {
            System.out.println("Name: " + g.getName());
            System.out.println("Price: " + g.getPrice());
            System.out.println("Description: " + g.getDescription());
            System.out.println("--------------------------");
        }
        System.out.println("Total Amount: " + calculateTotalAmount());
    }
}
