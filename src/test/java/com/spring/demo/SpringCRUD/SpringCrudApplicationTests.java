package com.spring.demo.SpringCRUD;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.entity.User;
import com.spring.demo.SpringCRUD.service.CustomerService;
import com.spring.demo.SpringCRUD.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootTest
class SpringCrudApplicationTests {
	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
//		User user = userService.getById();
	}

}
