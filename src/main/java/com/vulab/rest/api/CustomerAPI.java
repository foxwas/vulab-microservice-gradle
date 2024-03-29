package com.vulab.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vulab.rest.domain.Customer;
import com.vulab.rest.repository.CustomersRepository;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {
	@Autowired
	CustomersRepository repo;

	@GetMapping
	public Iterable<Customer> getAll() {
		System.out.println("CustomerAPI getAll() is called");
		return repo.getCustomerList();
	}

	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") long id) {
		List<Customer> customerList = this.repo.getCustomerList();
		Customer customer = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getId() == id) {
				customer = customerList.get(i);
			}
		}
		System.out.println("CustomerAPI getCustomerById() is called for " + id);
		return customer;
	}
	
	
	
}
