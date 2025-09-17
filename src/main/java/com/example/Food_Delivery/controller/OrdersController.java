package com.example.Food_Delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Orders;
import com.example.Food_Delivery.service.OrdersService;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {
	
	@Autowired
	public OrdersService ordersService;
	
	@GetMapping("{id}")
	public Orders getOrderById(@PathVariable int id) throws CustomException{
		return ordersService.getOrderById(id);
	}
}
