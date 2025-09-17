package com.example.Food_Delivery.service;

import java.util.List;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Customers;

public interface CustomerService {
	public List<Customers> getAllCustomers();
	public Customers getCustomerById(int id) throws CustomException;
	public Customers updateCustomer(int id, Customers updateCustomer) throws CustomException;
	public void deleteCustomer(int id) throws CustomException;
	public List<Customers> getAllCustomersOrders();
	public List<Customers> getCustomersReview();
	public Customers createFavorites();
	public Customers deleteCustomerFavorite();
}
