package com.spring.demo.SpringCRUD.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties("products")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String city;
    /*@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Product> productList = new ArrayList<>();*/
   //@JsonIgnoreProperties("customers")
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_product",
            joinColumns = @JoinColumn(name = "customer_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id",referencedColumnName = "id")

    )
     @JsonManagedReference
    Set<Product> products ;
}
