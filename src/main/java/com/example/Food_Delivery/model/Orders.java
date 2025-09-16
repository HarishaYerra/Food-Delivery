package com.example.Food_Delivery.model;

import java.util.Date;
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
@Table(name = "Orders")
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int order_id;
	private Date order_date;
	private int customer_id;
	private int restaurant_id;
	private int deliverydriver_id;
	private String order_status;
	
	
	@OneToMany(mappedBy = "order")
	@JsonManagedReference
	private List<OrderItems> orderItems;
	
	
	@OneToMany(mappedBy ="order")
	@JsonManagedReference
	private List<Rating> Rating;
	
	@OneToMany(mappedBy ="order")
	@JsonManagedReference
	private List<OrdersCoupons> orderscoupons;
	
	@ManyToOne
	@JoinColumn(name="restaurant_id")
	@JsonBackReference
	private Restaurants restaurants;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	@JsonBackReference
	private Customers customers;
	
	@ManyToOne
	@JoinColumn(name="driver_id")
	@JsonBackReference
	private DeliveryDrivers deliverydriver;
}

	

