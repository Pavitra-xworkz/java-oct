package com.xworkz.method.theater;

import com.xworkz.method.theater.Customer;

public class InstanceTester {
	
	public static void main(String[] args) {
		
		
		Customer customer=new Customer();
		String name=customer.getName();
		customer.setName("Nikita");
		System.out.println(customer.getName());
	}

}

