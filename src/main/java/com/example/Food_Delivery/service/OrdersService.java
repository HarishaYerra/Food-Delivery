package com.example.Food_Delivery.service;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Orders;

public interface OrdersService {
	public Orders getOrderById(int id) throws CustomException;
	//public Orders createOrders();
	public Orders updateOrderStatus(int id, String status) throws CustomException;
	public void deleteOrder(int id) throws CustomException;
}
