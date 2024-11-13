package oop.lab.task.pkg3;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phone;
    private List<Order> orders = new ArrayList<>();

    public Customer(String customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        order.printOrderDetails();
        System.out.println("Order Placed");
    }

    public List<Order> viewOrders() {
        return orders;
    }
}