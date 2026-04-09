package com.restaurant.btth.model;

public class Dish {
    private int id;
    private String name;
    private double originalPrice;
    private int discountPercent;

    public Dish(int id, String name, double originalPrice, int discountPercent) {
        this.id = id;
        this.name = name;
        this.originalPrice = originalPrice;
        this.discountPercent = discountPercent;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getOriginalPrice() { return originalPrice; }
    public int getDiscountPercent() { return discountPercent; }
}

