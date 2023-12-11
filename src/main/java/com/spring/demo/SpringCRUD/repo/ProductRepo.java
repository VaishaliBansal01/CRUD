package com.spring.demo.SpringCRUD.repo;

import com.spring.demo.SpringCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    //List<Product> findByBrand(String brand);

    @Query(value = "SELECT c.* FROM Customer c " +
            "JOIN customer_product cp ON c.id = cp.customer_id " +
            "WHERE cp.product_id = :id", nativeQuery = true)
    Product getProductByIdWithCustomers(@Param("id") Long id);
}



