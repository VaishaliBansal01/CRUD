package com.spring.demo.SpringCRUD.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String city;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Product> productList = new ArrayList<>();
}
