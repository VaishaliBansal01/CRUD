/*package com.spring.demo.SpringCRUD.longtocustomerconverter;

import com.spring.demo.SpringCRUD.entity.Customer;
import com.spring.demo.SpringCRUD.repo.CustomerRepo;
import com.spring.demo.SpringCRUD.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LongToCustomerConverter implements Converter<Long, Customer> {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    ProductRepo productRepo;


    @Override
    public Customer convert(Long id) {
        System.out.println("converter class");
        return (Customer) productRepo.findByIdWithCustomers(id);
    }*/

  /*  @Override
    public <U> Converter<Long, U> andThen(Converter<? super Customer, ? extends U> after) {
        return Converter.super.andThen(after);
    }*/
//}
