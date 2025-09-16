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
@Table(name = "DeliveryDrivers")
public class DeliveryDrivers {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int driver_id;
	private String driver_name;
	private String driver_phone;
	private String driver_vehicle;
	
	@OneToMany(mappedBy="deliverydriver")
	@JsonManagedReference
	private List<Orders> orders;
}
