package com.spring.demo.SpringCRUD.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
    String productName;
    String brand;
    /* @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;*/
    /*@OneToMany
    Customer customer;*/
    @ManyToMany(mappedBy = "products", cascade=CascadeType.ALL, fetch = FetchType.EAGER)

//    @JsonIgnoreProperties("products")
    @JsonBackReference
    @JsonIgnore
    Set<Customer> customers = new HashSet<>();
}
