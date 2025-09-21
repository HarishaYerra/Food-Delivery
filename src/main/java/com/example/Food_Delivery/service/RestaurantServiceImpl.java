package com.example.Food_Delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Restaurants;
import com.example.Food_Delivery.repository.RestaurantsRepository;

public class RestaurantServiceImpl implements RestaurantsService{
	
	@Autowired
	private RestaurantsRepository restaurantsRepository;
	
	
	//Get all the restaurants
	@Override
	public List<Restaurants> getAllRestaurants(){
		return restaurantsRepository.findAll();
	}
	
	
	//Get the Restaurant by id
	@Override
	public Restaurants getRestaurantById(int id) throws CustomException{
		return restaurantsRepository.findById(id)
				.orElseThrow(()->new CustomException("Restaurant Id not found"));
	}
	
	//Create restaurant
	@Override
	public Restaurants createRestaurant(Restaurants dto) {
		Restaurants restaurant= new Restaurants();
		restaurant.setRestaurant_name(dto.getRestaurant_name());
		restaurant.setRestaurant_name(dto.getRestaurant_name());
		restaurant.setRestaurant_address(dto.getRestaurant_address());
		restaurant.setRestaurant_phone(dto.getRestaurant_phone());
		return restaurantsRepository.save(restaurant);
	}
	
	//update restaurant
	@Override
	public Restaurants updateRestaurant(int id, Restaurants updateRestaurant) throws CustomException{
		Restaurants existing=restaurantsRepository.findById(id)
				.orElseThrow(()->new CustomException("Restaurant Id not found"));
		existing.setRestaurant_name(updateRestaurant.getRestaurant_name());
		existing.setRestaurant_address(updateRestaurant.getRestaurant_address());
		existing.setRestaurant_phone(updateRestaurant.getRestaurant_phone());
		return restaurantsRepository.save(existing);
	}
	
	//Delete restaurant
	@Override
	public void deleteRestaurant(int id) throws CustomException {
		Restaurants restaurant=restaurantsRepository.findById(id)
				.orElseThrow(()->new CustomException("Restaurant Id not found"));
		restaurantsRepository.delete(restaurant);
	}
	
	//get restaurant menu
	@Override
	public List<Restaurants> getRestaurantMenu(int id) throws CustomException{
		Restaurants restaurant=restaurantsRepository.findById(id)
				.orElseThrow(()->new CustomException("Restaurant Id not found"));
		return restaurantsRepository.getRestaurantMenu();
	}
	
	//get restaurant reviews
	@Override
	public List<Restaurants> getRestaurantReviews(int id) throws CustomException{
		Restaurants restaurant=restaurantsRepository.findById(id)
				.orElseThrow(()->new CustomException("Restaurant Id not found"));
		return restaurantsRepository.getRestaurantReviews();
	}
		
	//get restaurant delivery address
	@Override
	public List<Restaurants> getRestaurantDeliveryAreas(int id) throws CustomException{
		Restaurants restaurant=restaurantsRepository.findById(id)
				.orElseThrow(()->new CustomException("Restaurant Id not found"));
		return restaurantsRepository.getRestaurantDeliveryAreas();
	}

}
