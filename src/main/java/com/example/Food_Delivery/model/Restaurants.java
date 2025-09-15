package com.example.Food_Delivery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Restaurants")
public class Restaurants {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int restaurant_id;
	private String restaurant_name;
	private String restaurant_address;
	private String restaurant_phone;
	
}
