package com.example.Food_Delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.MenuItems;
import com.example.Food_Delivery.service.MenuItemsService;

@RestController
@RequestMapping("/api/v1/restaurants/{retaurantId}/menu")
public class MenuItemsController {
	
	@Autowired 
	private MenuItemsService menuItemsService;
	
	@GetMapping
	public List<MenuItems> getRestaurantMenu() throws CustomException{
		return menuItemsService.getRestaurantMenu();
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<MenuItems> updateRestaurantMenu(@PathVariable int id, @RequestBody MenuItems updatedMenu) throws CustomException{
		MenuItems updated= menuItemsService.updateRestaurantMenu(id, updatedMenu);
		return  ResponseEntity.ok(updated);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRestaurantMenu(@PathVariable int id) {
		menuItemsService.deleteRestaurantMenu(id);
		return ResponseEntity.ok("Menu deleted with id:"+id);
	}

}
