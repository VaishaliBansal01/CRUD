package com.spring.demo.SpringCRUD.controller;

import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/product")
    public Product createProduct( Product product)
    {
        return productService.createProduct(product);
    }
}
