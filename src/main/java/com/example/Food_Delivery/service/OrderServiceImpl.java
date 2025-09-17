package com.example.Food_Delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Orders;
import com.example.Food_Delivery.repository.OrdersRepository;

@Service
public class OrderServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Override
	public Orders getOrderById(int id) throws CustomException{
		return ordersRepository.findById(id)
				.orElseThrow(()->new CustomException("Order not found with id:"+id));
	}
//	public Orders createOrders();
//	public Orders updateOrderStatus();
//	public Orders deleteOrder();
}
