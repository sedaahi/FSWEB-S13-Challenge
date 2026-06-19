package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 1000),
    STANDARD("Standard Plan", 2000),
    PREMIUM("Premium Plan", 3000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}