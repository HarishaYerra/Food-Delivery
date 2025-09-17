package com.example.Food_Delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Customers;
import com.example.Food_Delivery.repository.CustomersRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomersRepository customersRepository;
	
	
	@Override
	public List<Customers> getAllCustomers() {
		return customersRepository.findAll();
		
	}
	
	@Override
	public Customers getCustomerById(int id) throws CustomException{
		return customersRepository.findById(id)
				.orElseThrow(()->new CustomException("Customer not found with the id:" +id));
		
	}
	
	@Override
	public Customers updateCustomer(int id, Customers updateCustomer) throws CustomException{
		Customers existing=customersRepository.findById(id)
				.orElseThrow(()->new CustomException("Customer not found with the id:" +id));
		existing.setCustomer_name(updateCustomer.getCustomer_name());
		existing.setCustomer_email(updateCustomer.getCustomer_email());
		existing.setCustomer_phone(updateCustomer.getCustomer_phone());
		return customersRepository.save(existing);
	}
	public void deleteCustomer(int id) throws CustomException{
		Customers customer=customersRepository.findById(id)
				.orElseThrow(()->new CustomException("Found the account to delete"));
		customersRepository.delete(customer);
	}
	public List<Customers> getAllCustomersOrders();
	public List<Customers> getCustomersReview();
	public Customers createFavorites();
	public Customers deleteCustomerFavorite();
}
