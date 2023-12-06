package com.spring.demo.SpringCRUD.service;

import com.spring.demo.SpringCRUD.entity.Address;
import com.spring.demo.SpringCRUD.entity.Product;
import com.spring.demo.SpringCRUD.entity.User;
import com.spring.demo.SpringCRUD.repo.AddressRepo;
import com.spring.demo.SpringCRUD.repo.ProductRepo;
import com.spring.demo.SpringCRUD.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;
    @Autowired
    AddressRepo addressRepo;
    @Autowired
    ProductRepo productRepo;
    public User createUser(User user)
    {
       /* Address address = new Address();
        address.setCity(user.getAddress().getCity());
        address.setPostalCode(user.getAddress().getPostalCode());
        addressRepo.save(address);

        User user1 = new User();
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setAddress(address);
*/

        //return userRepo.save(user1);
        User user1 = new User();
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
//        userRepo.save(user1);

        User savedUser = userRepo.save(user1);




      /*  List<Product> productList = new ArrayList<>();

        Product product1 = new Product();
         product1.setProductName("phone");
       *//* product1.setProductName(String.valueOf(user.getProductList().get(0)));
        product1.setBrand(String.valueOf(user.getProductList().get(0)));*//*
         product1.setBrand("x");
         product1.setUser(savedUser);
//         productRepo.save(product1);

         Product product2 = new Product();
        product2.setProductName("tv");
         product2.setBrand("y");
       *//* product2.setProductName(String.valueOf(user.getProductList().get(1)));
        product2.setBrand(String.valueOf(user.getProductList().get(1)));*//*

         product2.setUser(savedUser);
//         productRepo.save(product2);


        productList.add(productRepo.save(product1));
        productList.add(productRepo.save(product2));

        savedUser.setProductList(productList);
*/

        /* user1.getProductList().add(product1);
         user1.getProductList().add(product2);*/

       return userRepo.save(savedUser);


//        return userRepo.save(user);
    }

    public Optional<User> getById(Long id)
    {
        return userRepo.findById(id);
    }

    public User updateUser(User user, Long id) {
        User user1 = userRepo.findById(id).get();

        if(user1 != null)
        {
            user1.setEmail(user.getEmail());

            return userRepo.save(user1);
        }
        else
            return null;
    }


    public void deleteUser(Long id)
    {
        User user1 = userRepo.findById(id).get();
        if(user1!=null)
        {
            userRepo.deleteById(id);
        }


    }
}
