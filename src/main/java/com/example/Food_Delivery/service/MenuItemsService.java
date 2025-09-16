package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.model.MenuItems;

public interface MenuItemsService {
	public List<MenuItems> getAllRestaurantMenu();
	public MenuItems createRestaurantMenu();
	public MenuItems updateRestaurantMenu();
	public MenuItems deleteRestaurantMenu();
	
}
