package com.spring.demo.SpringCRUD.controller;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.service.CustomerService;
import com.spring.demo.SpringCRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ProductService productService;
    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer)
    {
        return customerService.createCustomer(customer);
    }
    /*@PostMapping("/customer_product")
    public ResponseEntity<String> customerProduct(@RequestParam Long customer_id, @RequestParam Long product_id)
    {
        try {
            customerService.customerProduct(customer_id, product_id);
            return ResponseEntity.ok("successfull");
        }
        catch (IllegalArgumentException e)
        {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }*/
    @PostMapping("/customer_product")
    public Customer customerProduct(@RequestParam Long customer_id, @RequestParam Long product_id)
    {
        return customerService.customerProduct(customer_id, product_id);
    }
    @GetMapping("/{customer_Id}")
    public ResponseEntity<Set<Product>> getProductsByCustomerId(@PathVariable Long customer_Id)
    {
        Set<Product> products = customerService.getProductsByCustomerId(customer_Id);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }


}
