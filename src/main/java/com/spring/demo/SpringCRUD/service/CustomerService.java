package com.spring.demo.SpringCRUD.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.spring.demo.SpringCRUD.dto.CustomerDTO;
//import com.spring.demo.SpringCRUD.dto.ProductDTO;
import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.repo.CustomerRepo;
import com.spring.demo.SpringCRUD.repo.ProductRepo;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
@Transactional
    public Product customerProduct(Long customerId, Long productId)
    {
        Optional<Customer> customer = customerRepo.findById(customerId);
        Optional<Product> product = productRepo.findById(productId);
//        Optional<Product> product2=productRepo.findById(2L);
        //if (customer.isPresent() && product.isPresent()) {
            Customer customer1 = customer.get();
            Product product1 = product.get();

            customer1.getProducts().add(product1);
            customerRepo.save(customer1);
//
        product1.getCustomers().add(customer1);
//           productRepo.save(product1);
        return productRepo.save(product1);



       /* else {
            throw new IllegalArgumentException("not found");
        }*/
    }
    @JsonIgnore
    @Transactional
    public Customer getCustomerById(Long id) {
/*
        Customer customer = customerRepo.findById(id).get();
        return customer;*/
        Set<Product> products = new HashSet<>();

        //Customer customer = customerRepo.findById(id).get();

       return customerRepo.findById(id).get();
//        Set<Product> products =customer.get().getProducts();

        /*if (customer!=null) {
          Hibernate.initialize(customer.getProducts());
          products= customer.getProducts();
      }
        return customer;*/
    }


   /* public Set<Product> getProductsByCustomerId(Long customer_Id) {
        return customerRepo.findProductsByCustomerId(customer_Id);
    }*/
    //}

   /* @Transactional
    public CustomerDTO getCustomerWithProductsById(Long customerId) {
        Customer customer = customerRepo.findById(customerId).orElse(null);

        if (customer != null) {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setId(customer.getId());
            customerDTO.setName(customer.getName());
            customerDTO.setCity(customer.getCity());

            Set<ProductDTO> productDTOs = customer.getProducts().stream()
                    .map(this::convertToProductDTO)
                    .collect(Collectors.toSet());

            customerDTO.setProducts(productDTOs);
            return customerDTO;
        } else {
            return null; // or throw an exception
        }
    }

    private ProductDTO convertToProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setProductName(product.getProductName());
        productDTO.setBrand(product.getBrand());
        return productDTO;
    }*/
}