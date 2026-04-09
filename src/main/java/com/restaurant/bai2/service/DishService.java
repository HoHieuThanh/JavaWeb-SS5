package com.restaurant.bai2.service;

import com.restaurant.common.Dish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishService {
    public List<Dish> getAllDishes() {
        List<Dish> list = new ArrayList<>();
        list.add(new Dish(1, "Cơm", 5000, true));
        list.add(new Dish(2, "Canh", 2000, false));
        list.add(new Dish(3, "Cua", 20000, true));
        return list;
    }
}
