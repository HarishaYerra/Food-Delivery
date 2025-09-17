package com.example.Food_Delivery.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "OrderItems")
public class OrderItems {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderitem_id;
	private int quantity;
	
	@ManyToOne
    @JoinColumn(name = "order_id")
    @JsonBackReference
    private Orders order;
	
	@ManyToOne
    @JoinColumn(name = "items_id")
    @JsonBackReference
    private MenuItems menuitem;
}

	