package com.udacity.store.controller;

import com.udacity.store.model.Order;
import com.udacity.store.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders/")
@CrossOrigin(origins = "http://localhost:4200")

public class OrderController {
// TODO: Use the mapping submit to add an API endpoint to fetch the products from the OrderRepository
@Autowired
OrderRepository orderRepository;

@GetMapping("/order/{id}")
    public Order getOrder(@PathVariable Long id){

  return orderRepository.findById(id).get();

    }

    @GetMapping("/order")
    public List<Order> getAllOrder(){
        List<Order> Orders = orderRepository.findAll();
        return Orders;
    }

    @PostMapping("save-order")
    public void addOrder(Order order){
    orderRepository.save(order);
    }

}
