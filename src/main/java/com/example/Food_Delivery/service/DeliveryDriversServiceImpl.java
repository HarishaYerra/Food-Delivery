package com.example.Food_Delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.DeliveryDrivers;
import com.example.Food_Delivery.model.Restaurants;
import com.example.Food_Delivery.repository.DeliveryDriversRepository;

@Service
public class DeliveryDriversServiceImpl implements DeliveryDriversService{

	@Autowired
	private DeliveryDriversRepository deliveryDriversRepository;
	
	@Override
	public List<DeliveryDrivers> getAllDeliveryDrivers() {
		return deliveryDriversRepository.findAll();
	}
	
	@Override
	public DeliveryDrivers getDeliveryDriversById(int id) throws CustomException{
		return deliveryDriversRepository.findById(id)
				.orElseThrow(()->new CustomException("Driver Id not found"));
		
	}
	public Restaurants updateAssignDrivertoOrder();
	public Restaurants updateDriverLocation();
	public List<DeliveryDrivers> getAllDriversOrders(int id) throws CustomException{
		DeliveryDrivers order=deliveryDriversRepository.findById(id)
				.orElseThrow(()->new CustomException("Driver Id not found"));
		
	}
	
}
