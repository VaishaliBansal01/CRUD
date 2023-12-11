package com.spring.demo.SpringCRUD.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

//  @JsonIgnoreProperties("products")
   // @JsonBackReference
    @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER)
    //@JsonIgnore
        @JsonBackReference
    Set<Customer> customers ;
}
