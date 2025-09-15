package com.example.Food_Delivery.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class MenuItems {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int item_id;
	private String item_name;
	private String item_description;
	private Long item_price;
	private int restaurant_id;
}
