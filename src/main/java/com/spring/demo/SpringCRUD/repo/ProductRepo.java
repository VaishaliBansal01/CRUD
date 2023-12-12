package com.spring.demo.SpringCRUD.repo;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface ProductRepo extends JpaRepository<Product, Long> {

    //List<Product> findByBrand(String brand);

    /*@Query(value = "SELECT c.* FROM Customer c " +
            "JOIN customer_product cp ON c.id = cp.customer_id " +
            "WHERE cp.product_id = :id", nativeQuery = true)
    Product getProductByIdWithCustomers(@Param("id") Long id);*/

    //@Query("SELECT p FROM Product p LEFT JOIN FETCH p.customers WHERE p.id = :id")
    //@Query("SELECT c FROM Customer c JOIN c.products p WHERE p.id = :id")
   /* @Query(value = "SELECT c.* FROM customer c " +
            "JOIN customer_product cp ON c.id = cp.customer_id " +
            "WHERE cp.product_id = :id", nativeQuery = true)*/
    @Query("SELECT p.customers FROM Product p WHERE p.id = :id")
    Set<Customer> findByIdWithCustomers(@Param("id") Long id);

}



