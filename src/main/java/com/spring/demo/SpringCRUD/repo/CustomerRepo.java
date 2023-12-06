package com.spring.demo.SpringCRUD.repo;

import com.spring.demo.SpringCRUD.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Long> {


    Optional<Customer> findById(Long customer_id);
}