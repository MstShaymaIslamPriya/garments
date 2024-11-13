package oop.lab.task.pkg3;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String id;
    private String name;
    private String contactInfo;
    private List<Fabric> suppliedFabric = new ArrayList<>();

    public Supplier(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void addFabric(Fabric fabric) {
        suppliedFabric.add(fabric);
    }

    public List<Fabric> getSuppliedFabrics() {
        return suppliedFabric;
    }
}