package com.example.Food_Delivery.model;

import java.util.Date;
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
@Table(name = "Coupons")
public class Coupons {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int coupon_id;
	private int coupon_code;
	private Double discount_amount;
	private Date expiry_date;
	
	@OneToMany(mappedBy="coupons")
	@JsonManagedReference
	private List<OrdersCoupons> ordercoupons;
}
