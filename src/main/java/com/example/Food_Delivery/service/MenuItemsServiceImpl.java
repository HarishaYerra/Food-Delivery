package com.example.Food_Delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.MenuItems;
import com.example.Food_Delivery.repository.MenuItemsRepository;

@Service
public class MenuItemsServiceImpl implements MenuItemsService {
	@Autowired
	private MenuItemsRepository menuItemsRepository;
	
	@Override
	public List<MenuItems> getRestaurantMenu() throws CustomException{
		return menuItemsRepository.findAll();
	}
	
	public MenuItems createRestaurantMenu() {
		
	}
	
	@Override
	public MenuItems updateRestaurantMenu(int id, MenuItems updatedMenu) throws CustomException {
		
		MenuItems existing=menuItemsRepository.findById(id)
				.orElseThrow(()->new CustomException("ItemId not found"));
		existing.setItem_name(updatedMenu.getItem_name());
		existing.setItem_description(updatedMenu.getItem_description());
		existing.setItem_price(updatedMenu.getItem_price());
		return menuItemsRepository.save(existing);
	}
	
	
	@Override
	public void deleteRestaurantMenu(int id) throws CustomException{
		MenuItems menu=menuItemsRepository.findById(id)
				.orElseThrow(()->new CustomException("Menu id not found"));
		menuItemsRepository.delete(menu);
	}
}
