package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.DeliveryDrivers;
import com.example.Food_Delivery.model.Restaurants;

public interface DeliveryDriversService {
	public List<DeliveryDrivers> getAllDeliveryDrivers();
	public DeliveryDrivers getDeliveryDriversById(int id) throws CustomException;
	public Restaurants updateAssignDrivertoOrder();
	public Restaurants updateDriverLocation();
	public List<DeliveryDrivers> getAllDriversOrders();

}
