package oop.lab.task.pkg3;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OopLabTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        Customer customer = new Customer("C001", "Alice", "alice@example.com", "1234567890");

        while (true) {
            System.out.println("==== Garment Management System ====");
            System.out.println("1. Add Garment");
            System.out.println("2. View Inventory");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Garment ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Size: ");
                    String size = scanner.nextLine();
                    System.out.print("Enter Color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Stock Quantity: ");
                    int stockQuantity = scanner.nextInt();

                    Garment garment = new Garment(id, name, description, size, color, price, stockQuantity);
                    inventory.addGarment(garment);
                    System.out.println("Garment added successfully!");
                    break;

                case 2:
                    inventory.displayGarments();
                    break;

                case 3:
                    Order order = new Order("O001", new Date());
                    System.out.print("Enter Garment ID to add to order: ");
                    String orderId = scanner.nextLine();
                    Garment g = inventory.findGarment(orderId);
                    if (g != null) {
                        order.addGarment(g);
                        customer.placeOrder(order);
                    } else {
                        System.out.println("Garment not found!");
                    }
                    break;

                case 4:
                    List<Order> orders = customer.viewOrders();
                    for (Order o : orders) {
                        o.printOrderDetails();
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}