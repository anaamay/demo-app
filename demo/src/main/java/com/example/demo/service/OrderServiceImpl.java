package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Transactional(propagation = Propagation.NEVER)
	@Override
	public Order findById(Long Id) {
		return orderRepository.findById(Id).get();
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
