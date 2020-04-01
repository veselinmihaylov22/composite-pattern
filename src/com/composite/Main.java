package com.composite;

public class Main {

    public static void main(String[] args) {
        Product iphone6 = new Product("iPhone 6S", "2015 brand new iPhone 6S",350.0);
        Product iphone10 = new Product("iPhone 10", "2019 brand new iPhone 10",1050.0);

        Category iosProducts = new Category("iOS Products","Apple Inc. is an American multinational technology company headquartered in Cupertino.");
        iosProducts.add(iphone6);
        iosProducts.add(iphone10);
        iosProducts.showInfo();

        iphone6.showInfo();
    }
}
