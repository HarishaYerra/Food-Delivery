package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.model.Orders;

public interface OrdersService {
	public List<Orders> getOrdersById();
	public Orders createOrders();
	public Orders updateOrderStatus();
	public Orders deleteOrder();
}
