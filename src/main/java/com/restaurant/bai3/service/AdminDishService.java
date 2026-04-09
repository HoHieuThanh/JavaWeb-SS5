package com.restaurant.bai3.service;

import com.restaurant.common.Dish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminDishService {

    private static final List<Dish> list = new ArrayList<>();

    static {
        list.add(new Dish(1, "Cơm", 5000, true));
        list.add(new Dish(2, "Canh", 2000, false));
        list.add(new Dish(3, "Cua", 20000, true));
    }

    public Dish findById(int id) {
        return list.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
