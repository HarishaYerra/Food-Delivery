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
//	@Override
//	public Orders createOrders(int id,Orders order) throws CustomException{
//		order.setOrder_date(null);
//		order.set
//	}
	
	@Override
	public Orders updateOrderStatus(int id, Orders updatedStatus) throws CustomException{
		Orders existing=ordersRepository.findById(id)
				.orElseThrow(()->new CustomException("Order not found with id:"+id));
		existing.setOrder_status(updatedStatus.getOrder_status());
		return ordersRepository.save(existing);
	}
	
	@Override
	public void deleteOrder(int id) throws CustomException{
		Orders order=ordersRepository.findById(id)
				.orElseThrow(()->new CustomException("Order not found with id:"+id));
		ordersRepository.delete(order);
	}
}
