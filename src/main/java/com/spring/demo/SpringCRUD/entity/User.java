package com.spring.demo.SpringCRUD.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    String name;
    String email;
     //address_add_id
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "address_id")
     private Address address;

    /* @OneToMany
     private List<Address> addressList = new ArrayList<>();*/
}
