package com.spring.demo.SpringCRUD.repo;

import com.spring.demo.SpringCRUD.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long > {
}
