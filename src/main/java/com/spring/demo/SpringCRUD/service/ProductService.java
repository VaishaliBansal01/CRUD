package com.spring.demo.SpringCRUD.service;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.repo.CustomerRepo;
import com.spring.demo.SpringCRUD.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
        /*Customer customer = new Customer();
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
        productList.add(product2);*/

        return productRepo.save(product);
    }

    public void addCustomerToProduct(Long productId, Long customerId) {

        Optional<Product> product1 =productRepo.findById(productId);
        Optional<Customer> customer1 = customerRepo.findById(customerId);

        if(product1.isPresent()&& customer1.isPresent())
        {
            Product product =product1.get();
            Customer customer =customer1.get();

            product.getCustomers().add(customer);
            customer.getProducts().add(product);

//            productRepo.save(product);
            customerRepo.save(customer);
        }
        else {

            throw new IllegalArgumentException("pro or cus not found");
        }
    }
    @Transactional(readOnly = true)
    public Product getProductById(Long id) {

       return productRepo.findById(id).get();

    }

    public Set<Customer> getProductByIdWithCustomers(Long id) {
        System.out.println("service");
        return productRepo.findByIdWithCustomers(id);
    }
}
