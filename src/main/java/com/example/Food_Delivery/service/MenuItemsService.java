package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.MenuItems;

public interface MenuItemsService {
	public List<MenuItems> getRestaurantMenu() throws CustomException;
	public MenuItems createRestaurantMenu() throws CustomException;
	public MenuItems updateRestaurantMenu(int id, MenuItems updatedMenu) throws CustomException;
	public void deleteRestaurantMenu(int id) throws CustomException;
	
}
