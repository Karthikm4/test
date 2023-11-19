package com.hexaware.fooddelivery.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.fooddelivery.dto.CustomersDTO;
import com.hexaware.fooddelivery.entity.Customers;

class CustomersServiceImpTest {
	@Autowired
	ICustomersService service;
	
	@Test
	void testAddCustomers() {
		CustomersDTO customersDTO=new CustomersDTO();
		
		customersDTO.setCustomerId(100);
		customersDTO.setCustomerName("Karthik");
		customersDTO.setEmail("abc@gmail.com");
		customersDTO.setPhoneNumber("1234567890");
		customersDTO.setDeliveryAddress("ongole");
		Customers customers=service.addCustomers(customersDTO);
		assertEquals("Karthik", customers.getCustomerName());
	}

	@Test
	void testGetById() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllCustomers() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateCustomers() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	void testGetByCustomerName() {
		fail("Not yet implemented");
	}

}
