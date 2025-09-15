package com.example.Food_Delivery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Deliver_Address")
public class DeliveryAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int address_id;
	private int customer_id;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String postal_code;
}
