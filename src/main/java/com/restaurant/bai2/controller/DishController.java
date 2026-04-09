package com.restaurant.bai2.controller;

import com.restaurant.bai2.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DishController {

    private final DishService service;

    @Autowired
    public DishController(DishService service) {
        this.service = service;
    }

    @GetMapping("/bai2/dishes")
    public String getDishes(Model model) {
        model.addAttribute("dishes", service.getAllDishes());
        return "dish-list";
    }
}
