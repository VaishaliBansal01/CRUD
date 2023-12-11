package com.spring.demo.SpringCRUD.repo;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

//    @Query("SELECT c FROM Customer c LEFT JOIN FETCH c.products WHERE c.id = :id")
//    Customer getCustomerById(@Param("id") Long id);
//    Set<Product> findProductsByCustomerId(@Param("customerId")Long customer_Id);

    List<Customer> findCustomerByCity(String city);
}
