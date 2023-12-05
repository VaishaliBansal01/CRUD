package com.spring.demo.SpringCRUD.service;

import com.spring.demo.SpringCRUD.entity.Address;
import com.spring.demo.SpringCRUD.entity.User;
import com.spring.demo.SpringCRUD.repo.AddressRepo;
import com.spring.demo.SpringCRUD.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;
    @Autowired
    AddressRepo addressRepo;
    public User createUser(User user)
    {
        Address address = new Address();
        address.setCity(user.getAddress().getCity());
        address.setPostalCode(user.getAddress().getPostalCode());
        addressRepo.save(address);

        User user1 = new User();
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setAddress(address);


        return userRepo.save(user1);
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
