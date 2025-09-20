package com.example.Food_Delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Food_Delivery.Exception.CustomException;
import com.example.Food_Delivery.model.Customers;
import com.example.Food_Delivery.service.CustomerService;

@RestController
@RequestMapping("api/v1/customer")
public class CustomersController {
	
	@Autowired
	public CustomerService customerService;
	
	@GetMapping
	public List<Customers> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customers> getCustomerById(@PathVariable int id) throws CustomException{
		Customers customer=customerService.getCustomerById(id);
		return ResponseEntity.ok(customer);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Customers> updateCustomer(@PathVariable int id, @RequestBody Customers updateCustomer) throws CustomException{
		Customers updated=customerService.updateCustomer(id, updateCustomer);
		return ResponseEntity.ok(updated);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(int id) throws CustomException{
		customerService.deleteCustomer(id);
		return ResponseEntity.ok("Customer deleted with id:"+id);
	}

}
