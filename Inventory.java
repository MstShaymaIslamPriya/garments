package oop.lab.task.pkg3;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Garment> garments = new ArrayList<>();

    public void addGarment(Garment garment) {
        garments.add(garment);
    }

    public void removeGarment(String id) {
        garments.removeIf(g -> g.getId().equals(id));
    }

    public Garment findGarment(String id) {
        for (Garment g : garments) {
            if (g.getId().equals(id)) {
                return g;
            }
        }
        return null;
    }

    public void displayGarments() {
        for (Garment g : garments) {
            System.out.println("ID: " + g.getId() + ", Name: " + g.getName() + ", Price: " + g.getPrice());
        }
    }
}