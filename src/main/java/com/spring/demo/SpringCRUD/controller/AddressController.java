package com.spring.demo.SpringCRUD.controller;

import com.spring.demo.SpringCRUD.entity.Address;
import com.spring.demo.SpringCRUD.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("/address")
    public Address createAddress(@RequestBody Address address)
    {
        return addressService.createAddress(address);
    }
}
