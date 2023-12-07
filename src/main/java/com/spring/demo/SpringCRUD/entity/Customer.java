package com.spring.demo.SpringCRUD.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String city;
    /*@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Product> productList = new ArrayList<>();*/

    @ManyToMany
    @JoinTable(
            name = "customer_product",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )

//    @JsonIgnoreProperties("customers")
//    @JsonManagedReference
    Set<Product> products = new HashSet<>();
}
