package com.spring.demo.SpringCRUD.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long productId;

    String productName;

    String brand;




    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;
    /*@OneToMany
    Customer customer;*/
}
