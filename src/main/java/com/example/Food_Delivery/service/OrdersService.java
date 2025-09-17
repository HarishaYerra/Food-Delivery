package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Orders;

public interface OrdersService {
	public Orders getOrderById(int id) throws CustomException;
	public Orders createOrders();
	public Orders updateOrderStatus();
	public Orders deleteOrder();
}
