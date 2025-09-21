package com.example.Food_Delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Restaurants;
import com.example.Food_Delivery.service.RestaurantsService;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantsController {
	
	@Autowired
	private RestaurantsService restaurantService;
	
	//get all restaurants
	@GetMapping
	public List<Restaurants> getAllRestaurants(){
		return restaurantService.getAllRestaurants();
	}
	
	//get restaurant by id
	@GetMapping("{id}")
	public ResponseEntity<Restaurants> getRestaurantById(int id) throws CustomException{
		Restaurants restaurant= restaurantService.getRestaurantById(id);
		return ResponseEntity.ok(restaurant);
	}
	
	//create restaurant
	@PostMapping
	public ResponseEntity<String> createRestaurant(@RequestBody Restaurants dto) {
		Restaurants restaurant=  restaurantService.createRestaurant(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Restaurant Added successfully");
	}
	
	//update restaurant
	@PutMapping("{id}")
	public ResponseEntity<Restaurants> updateRestaurant(int id, Restaurants updateRestaurant) throws CustomException{
		Restaurants updated = restaurantService.updateRestaurant(id, updateRestaurant);
		return ResponseEntity.ok(updated);
	}
	
	//deleteRestaurant
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteRestaurant(int id) throws CustomException{
		restaurantService.deleteRestaurant(id);
		return ResponseEntity.ok("Restaurant is deleted");
	}
	
	//get all restaurant menu
	@GetMapping("{id}")
	public List<Restaurants> getRestaurantMenu(int id) {
		return restaurantService.getRestaurantMenu(id);
		
		
	}
	//get all restaurant menu
		@GetMapping("{id}")
	public List<Restaurants> getRestaurantReviews(int id) throws CustomException{
		return restaurantService.getRestaurantReviews(id);
	}
		
		//get all restaurant menu
		@GetMapping("{id}")
	public List<Restaurants> getRestaurantDeliveryAreas(int id) throws CustomException{
		return restaurantService.getRestaurantDeliveryAreas(id);
	}
	

}
