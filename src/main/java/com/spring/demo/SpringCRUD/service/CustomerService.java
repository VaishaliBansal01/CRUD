package com.spring.demo.SpringCRUD.service;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.repo.CustomerRepo;
import com.spring.demo.SpringCRUD.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    ProductRepo productRepo;

    public Customer createCustomer(Customer customer) {




//           Optional<Customer> customer1= customerRepo.findById(customer.getId());
//
//           Optional<Product> product1 = productRepo.findById(customer.getId());
//           Optional<Product> product2 = productRepo.findById(customer.getId());
//
//           customer1.get().getProducts().add(product1);
//           customer1.get().getProducts().add(product2);
//
//           product1.getCustomers().add(customer1);
//           product2.getCustomers().add(customer1);

           return customerRepo.save(customer);
        /*Customer customer1 = new Customer();
        customer1.setName("xyz");

        Product product1= new Product();
        product1.setProductName("shoes");
        product1.setBrand("x");


        Product product2 = new Product();
        product2.setProductName("book");
        product2.setBrand("y");

        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);*/

        //customer1.setProductList(productList);

    }

    public Customer customerProduct(Long customerId, Long productId)
    {
        Optional<Customer> customer = customerRepo.findById(customerId);
        Optional<Product> product = productRepo.findById(productId);
//        Optional<Product> product2=productRepo.findById(2L);
        //if (customer.isPresent() && product.isPresent()) {
            Customer customer1 = customer.get();
            Product product1 = product.get();

            customer1.getProducts().add(product1);
//            product1.getCustomers().add(customer1);

//           productRepo.save(product1);
        return customerRepo.save(customer1);



       /* else {
            throw new IllegalArgumentException("not found");
        }*/
    }


    public Set<Product> getProductsByCustomerId(Long customer_Id) {
        return customerRepo.findProductsByCustomerId(customer_Id);
    }




    //}
}