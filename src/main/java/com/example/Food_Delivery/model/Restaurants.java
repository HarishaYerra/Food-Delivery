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
@Table(name = "Restaurants")
public class Restaurants {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int restaurant_id;
	private String restaurant_name;
	private String restaurant_address;
	private String restaurant_phone;
	
	
	@OneToMany(mappedBy="restaurant")
	@JsonManagedReference
	private List<Rating> Rating;
	
	@OneToMany(mappedBy="restaurant")
	@JsonManagedReference
	private List<Orders> orders;
	
	@OneToMany(mappedBy="restaurant")
	@JsonManagedReference
	private List<MenuItems> menuitems;
	
	
}
