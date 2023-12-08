package com.spring.demo.SpringCRUD.repo;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.Set;

public interface CustomerRepo extends JpaRepository<Customer, Long> {


   // Set<Product> findProductsByCustomerId(@Param("customerId")Long customer_Id);
}
