package com.restaurant.bai5.repository;

import com.restaurant.bai5.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {

    public List<Item> getMockItems() {
        return List.of(
                new Item("Cơm", 10000, 2),
                new Item("Canh", 5000, 1),
                new Item("Cá", 20000, 1)
        );
    }
}
