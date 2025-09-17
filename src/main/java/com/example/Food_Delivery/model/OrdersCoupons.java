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
@Table(name = "orders_coupons")  // keep the same table name
public class OrdersCoupons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //private int order_id;
    //private int coupon_id;
    
    @ManyToOne
	@JoinColumn(name="coupon_id")
	@JsonBackReference
	private Coupons coupon;
    
    @ManyToOne
   	@JoinColumn(name="order_id")
   	@JsonBackReference
   	private Orders order;
}

