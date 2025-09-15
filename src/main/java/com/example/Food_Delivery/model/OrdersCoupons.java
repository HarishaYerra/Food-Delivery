package com.example.Food_Delivery.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class OrdersCoupons {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int order_id;
	private int coupon_id;
}
