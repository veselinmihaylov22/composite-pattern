package com.composite;

import java.util.ArrayList;

public class Category implements Component {

    private String name;
    private String description;
    private Component child;
    private ArrayList<Component> products = new ArrayList<Component>();


    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(Component product) {
        this.products.add(product);
    }

    @Override
    public void remove(Component product) {
        this.products.remove(product);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Component getChild() {
        return this.child;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Double getPrice() {
        // Category has no price
        return null;
    }

    @Override
    public void showInfo() {
        System.out.println("Showing products from " + this.name + ", " + this.description);
        System.out.println("Products: ");
        System.out.println("Name | Price | Description");
        System.out.println("__________________________");
        for (Component p: this.products) {
            p.showInfo();
        }
    }
}

