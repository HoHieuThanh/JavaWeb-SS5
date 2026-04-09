package com.restaurant.btth.controller;

import com.restaurant.btth.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromotionController {

    private final PromotionService service;

    @Autowired
    public PromotionController(PromotionService service) {
        this.service = service;
    }

    @GetMapping("/promotions")
    public String showPromotions(ModelMap model) {
        model.addAttribute("dishes", service.getPromotionDishes());
        return "promotion-list";
    }
}

