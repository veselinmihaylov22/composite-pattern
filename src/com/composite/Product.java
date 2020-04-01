package com.composite;

public class Product implements Component {

    private String name;
    private String description;
    private Double price;

    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public void add(Component component) {
        // Product cannot have children
    }

    @Override
    public void remove(Component component) {
        // Product cannot have children
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Component getChild() {
        // Product cannot have children
        return null;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void showInfo() {
        System.out.println(this.name + " | " + this.price + " BGN, " + this.description);
    }
}
