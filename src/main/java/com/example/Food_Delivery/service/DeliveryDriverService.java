package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.model.Restaurants;

public interface DeliveryDriverService {
	public List<Restaurants> getAllDeliveryDrivers();
	public List<Restaurants> getDeliveryDriverById();
	public Restaurants updateAssignDrivertoOrder();
	public Restaurants updateDriverLocation();
	public List<Restaurants> getAllDriversOrders();

}
