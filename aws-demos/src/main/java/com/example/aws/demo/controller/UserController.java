package com.example.aws.demo.controller;

import com.example.aws.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;


@RestController("/user")
public class UserController {

    @PostMapping("/create")
    public User createUser(User user){
        System.out.println("user created");
        return user;
    }

    @GetMapping("/find/{id}")
    public User findUser(@PathVariable Long id){
        User user = new User();
        user.setUserId(101L);
        user.setFirstName("Ramkishor");
        user.setLastName("Sikarwar");
        String dateOfBirthStr = "1990-12-04";
        user.setDateOfBirth(Date.valueOf(dateOfBirthStr));
        user.setCreateDate(new Date(System.currentTimeMillis()));
        user.setEmailId("ramkishor.sikarwar@yahoo.in");
        user.setDepartment("fidelity");
        return user;
    }

}
