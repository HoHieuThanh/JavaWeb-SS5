package com.restaurant.btth.service;


import com.restaurant.btth.model.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {

    public List<Dish> getPromotionDishes() {
        return List.of(
                new Dish(1, "Cơm rang", 50000, 10),
                new Dish(2, "Lẩu thái", 200000, 25),
                new Dish(3, "Gà rán", 120000, 30)
        );
    }
}

