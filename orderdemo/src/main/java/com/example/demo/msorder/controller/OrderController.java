package com.example.demo.msorder.controller;

import com.example.demo.msorder.entity.Order;
import com.example.demo.msorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    //直接调用
    @GetMapping(value = "/order0/{orderId}")
    public Order queryOrderById0(@PathVariable("orderId") String orderId) {
        System.out.println("111111111");
        return orderService.queryOrderById0(orderId);
    }

    @GetMapping(value = "/order/{orderId}")
    public Order queryOrderById(@PathVariable("orderId") String orderId) {
        System.out.println("111111111");
        return orderService.queryOrderById(orderId);
    }
}