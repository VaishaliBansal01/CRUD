package com.spring.demo.SpringCRUD.service;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    public Customer createCustomer(Customer customer)
    {
        Customer customer1 = new Customer();
        customer1.setName("xyz");

        Product product1= new Product();
        product1.setProductName("shoes");
        product1.setBrand("x");


        Product product2 = new Product();
        product2.setProductName("book");
        product2.setBrand("y");

        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);

        customer1.setProductList(productList);


        return customerRepo.save(customer1);
    }
}
