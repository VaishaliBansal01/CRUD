package com.spring.demo.SpringCRUD.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long add_id;
    String city;

    String postalCode;



}
