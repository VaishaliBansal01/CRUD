package com.spring.demo.SpringCRUD.controller;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.repo.CustomerRepo;
import com.spring.demo.SpringCRUD.repo.ProductRepo;
import com.spring.demo.SpringCRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/product/customer")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    ProductRepo productRepo;
    @Autowired
    CustomerRepo customerRepo;

    public ProductController(ProductRepo productRepo, CustomerRepo customerRepo)
    {
        this.productRepo=productRepo;
        this.customerRepo=customerRepo;
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
    @GetMapping("/product/{id}")
    public Set<Customer> getProductById(@PathVariable Long id)
    {
        System.out.println("product controller");
        return productService.
                getProductByIdWithCustomers(id);
    }


    /*@RequestMapping("/{product_id}/addCustomer/{customer_id}")
    public ResponseEntity<String> addCustomerToProduct(
            @PathVariable Long product_id,
            @PathVariable Long customer_id) {

        productService.addCustomerToProduct(product_id, customer_id);
        return ResponseEntity.ok("Customer added to product successfully!");
    }*/
}