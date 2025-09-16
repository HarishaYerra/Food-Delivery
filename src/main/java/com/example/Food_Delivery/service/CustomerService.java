package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.model.Customers;

public interface CustomerService {
	public List<Customers> getAllCustomers();
	public List<Customers> getAllCustomersById();
	public Customers updateCustomer();
	public Customers deleteCustomer();
	public List<Customers> getAllCustomersOrders();
	public List<Customers> getCustomersReview();
	public Customers createFavorites();
	public Customers deleteCustomerFavorite();
}
