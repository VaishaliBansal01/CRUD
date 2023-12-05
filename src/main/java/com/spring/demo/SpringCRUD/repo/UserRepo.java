package com.spring.demo.SpringCRUD.repo;

import com.spring.demo.SpringCRUD.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {


}
