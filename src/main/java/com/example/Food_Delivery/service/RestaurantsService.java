package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Restaurants;

public interface RestaurantsService {
	public List<Restaurants> getAllRestaurants();
	public Restaurants getRestaurantById(int id) throws CustomException;
	public Restaurants createRestaurant(Restaurants dto);
	public Restaurants updateRestaurant(int id, Restaurants updateRestaurant) throws CustomException;
	public Restaurants deleteRestaurant(int id) throws CustomException;
	public List<Restaurants> getRestaurantMenu(int id) throws CustomException;
	public List<Restaurants> getRestaurantReviews(int id) throws CustomException;
	public List<Restaurants> getRestaurantDeliveryAreas(int id) throws CustomException;
}
