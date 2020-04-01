package com.composite;

public interface Component {

    public void add(Component component);
    public void remove(Component component);
    public void showInfo();

    public String getName();
    public Component getChild();
    public String getDescription();
    public Double getPrice();
}
