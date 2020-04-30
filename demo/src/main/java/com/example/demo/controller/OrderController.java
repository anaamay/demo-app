package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	@GetMapping("/order/{orderId}")
	public Order findById(@PathVariable Long orderId){
		return orderService.findById(orderId);
	
	}
	
	@RequestMapping("/all")
	public List<Order> getAll(){
		List<Order> list =  orderService.getAll();
		for(Order order: list) {
			System.out.println(order.getCustomerSale().getId());
		}
		return list;
	}

}
