package com.restaurant.bai5.model;

import java.util.List;

public class Order {
    private List<Item> items;
    private double total;

    public Order(List<Item> items, double total) {
        this.items = items;
        this.total = total;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }
}
