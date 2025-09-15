package com.example.Food_Delivery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Orders-Coupons")
public class OrdersCoupons {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int order_id;
	private int coupon_id;
}
