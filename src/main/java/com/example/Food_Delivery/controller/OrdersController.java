package com.example.Food_Delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/{id}")
	public Orders getOrderById(@PathVariable int id) throws CustomException{
		return ordersService.getOrderById(id);
	}
	
	@PutMapping("/{orderId}/status")
	public ResponseEntity<Orders> updateOrderStatus(@PathVariable int id,@RequestBody String status) throws CustomException{
		Orders updated=ordersService.updateOrderStatus(id,status);
		return ResponseEntity.ok(updated);
	}
	
	@DeleteMapping("/{id}")
	public String deleteOrder(@PathVariable int id) {
		return ordersService.deleteOrder("Order is deleted");
	}
	
}
