package com.example.Food_Delivery.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Coupons")
public class Coupons {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int coupon_id;
	private int coupon_code;
	private Double discount_amount;
	private Date expiry_date;
}
