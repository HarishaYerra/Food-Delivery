package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.model.Restaurants;

public interface RestaurantsService {
	public List<Restaurants> getAllRestaurants();
	public List<Restaurants> getRestaurantById();
	public Restaurants createRestaurant();
	public Restaurants updateRestaurant();
	public Restaurants deleteRestaurant();
	public List<Restaurants> getRestaurantMenu();
	public List<Restaurants> getRestaurantReviews();
	public List<Restaurants> getRestaurantDeliveryAreas();
}
