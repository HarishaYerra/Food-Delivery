package com.example.Food_Delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Food_Delivery.model.Restaurants;

@Repository
public interface RestaurantsRepository extends JpaRepository<Restaurants, Integer>{
	List<Restaurants> getRestaurantMenu();
	List<Restaurants> getRestaurantReviews();
	List<Restaurants> getRestaurantDeliveryAreas();
}
