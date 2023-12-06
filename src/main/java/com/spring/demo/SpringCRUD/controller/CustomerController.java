package com.spring.demo.SpringCRUD.controller;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping("/customer")
    public Customer createCustomer( Customer customer)
    {
        return customerService.createCustomer(customer);
    }
}
