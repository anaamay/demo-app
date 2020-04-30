package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Order;

public interface OrderService {

	public Order findById(Long Id);
	public List<Order> getAll();
	
}
