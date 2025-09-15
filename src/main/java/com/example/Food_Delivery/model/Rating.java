package com.example.Food_Delivery.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Rating {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ratting_id;
	private int order_id;
	private int restaurant_id;
	private int rating;
	private String review;
}
