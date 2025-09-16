package com.example.Food_Delivery.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Customers")
public class Customers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String customer_id;
	private String customer_name;
	private String customer_email;
	private String customer_phone;
	
	@OneToMany(mappedBy="customer")
	@JsonManagedReference
	private List<Orders> orders;
	
	@OneToMany(mappedBy="customer")
	@JsonManagedReference
	private List<DeliveryAddress> deliveryaddress;
}
