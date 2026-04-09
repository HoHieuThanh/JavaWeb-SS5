package com.restaurant.bai5.service;

import com.restaurant.bai5.model.Item;
import com.restaurant.bai5.model.Order;
import com.restaurant.bai5.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repo;

    @Autowired
    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public Order createOrder() {
        List<Item> items = repo.getMockItems();

        double total = items.stream()
                .mapToDouble(Item::getTotal)
                .sum();

        return new Order(items, total);
    }
}
