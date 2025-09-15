package com.example.Food_Delivery.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Customers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String customer_id;
	private String customer_name;
	private String customer_email;
	private String customer_phone;
}
