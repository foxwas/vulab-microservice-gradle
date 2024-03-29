package com.vulab.rest.repository;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vulab.rest.domain.Customer;

@Repository
public class CustomersRepository  {
	
	private List<Customer> customerList = new ArrayList<Customer>();
	
	public CustomersRepository() {
		Customer c1 = new Customer(1, "eduardo", "pass", "eduardo@visa.com");
		Customer c2 = new Customer(2, "sofia", "pass", "sofia@visa.com");
		Customer c3 = new Customer(3, "saravanan", "pass", "sarkuppu@visa.com");
		
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		
				
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	

}
