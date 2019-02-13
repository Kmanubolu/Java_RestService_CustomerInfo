package com.test.customer;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import com.test.customer.bean.Customer;

@RestController
@EnableAutoConfiguration
public class CustomerApp {

	@RequestMapping(method = RequestMethod.GET, value = "/customer")
	Customer fetchCustomer() {

		Customer customer = new Customer();
		customer.setAge(35);
		customer.setFirstName("Krishna");
		customer.setLastName("Manubolu");
		customer.setCity("Hartford");

		return customer;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register/customer")
	@ResponseBody
	Customer registerCustomer(@RequestBody Customer custo) {
		Customer customer = new Customer();
		customer.setFirstName(custo.getFirstName());
		customer.setLastName(custo.getLastName());
		customer.setAge(custo.getAge());
		customer.setCity(custo.getCity());	
		return customer;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CustomerApp.class, args);
	}

}