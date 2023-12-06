package com.spring.demo.SpringCRUD.repo;

import com.spring.demo.SpringCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
