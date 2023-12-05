package com.spring.demo.SpringCRUD.service;

import com.spring.demo.SpringCRUD.entity.Address;
import com.spring.demo.SpringCRUD.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    public Address createAddress(Address address)
    {
      return addressRepo.save(address);
    }
}
