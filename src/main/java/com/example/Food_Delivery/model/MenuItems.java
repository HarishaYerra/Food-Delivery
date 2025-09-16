package com.example.Food_Delivery.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Menu_Items")
public class MenuItems {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int item_id;
	private String item_name;
	private String item_description;
	private Long item_price;
	private int restaurant_id;
	
	@OneToMany(mappedBy="menuitem")
	@JsonManagedReference
	private List<OrderItems> orderitems;
	
	@ManyToOne
	@JoinColumn(name="restaurant_id")
	@JsonBackReference
	private Restaurants restaurants;
}
