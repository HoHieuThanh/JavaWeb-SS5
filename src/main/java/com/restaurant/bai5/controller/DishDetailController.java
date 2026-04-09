package com.restaurant.bai5.controller;

import com.restaurant.bai5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai5")
public class DishDetailController {

    private final OrderService service;

    @Autowired
    public DishDetailController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/order")
    public String orderPage(Model model) {
        model.addAttribute("order", service.createOrder());
        return "bai5/order";
    }

    @ExceptionHandler(Exception.class)
    public String handleError(Model model) {
        model.addAttribute("errorMessage", "Có lỗi xảy ra!");
        return "error";
    }
}
