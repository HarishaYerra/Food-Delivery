package com.example.Food_Delivery.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class DeliveryDrivers {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int driver_id;
	private String driver_name;
	private String driver_phone;
	private String driver_vehicle;
}
