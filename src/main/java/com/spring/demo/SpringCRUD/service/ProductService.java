package com.spring.demo.SpringCRUD.service;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.repo.CustomerRepo;
import com.spring.demo.SpringCRUD.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    CustomerRepo customerRepo;

    public Product createProduct(Product product)
    {
        /* Long customerId = null;
        Optional<Customer> customer = customerRepo.findById(product.getCustomer().getId());
        if(customer!=null)
        {
           customerId = customer.get().getId();
        }

        Product product1= new Product();
        product1.setProductName(product.getProductName());
        product1.setBrand(product.getBrand());
        product1.setCustomer(customer.get());
*/
        // productList.add(product1);
        //productList.add(product2);
        Customer customer = new Customer();
        customer.setName("vaibhav");
        customer.setCity("noida");
        customerRepo.save(customer);

        Product product1 = new Product();
        product1.setProductName("pen");
        product1.setBrand("x");
        productRepo.save(product1);

        Product product2= new Product();
        product2.setProductName("book");
        product2.setBrand("y");
        productRepo.save(product2);

        List<Product> productList=new ArrayList<>();
        productList.add(product1);
        productList.add(product2);


       






        return productRepo.save(product1);
    }
}
