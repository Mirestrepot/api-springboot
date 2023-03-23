package com.javaspringboot.apispringboot.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspringboot.apispringboot.models.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setFirst_name("Lucas");
        user.setLast_name("MM");
        user.setEmail("asdf@gmail.com");
        user.setPassword("asdf");
        user.setCel("300123123");
        
        return user;
    }
    @RequestMapping(value = "users")
    public List<User> getUsers (){
        List <User> users = new ArrayList<>();
        User user = new User();
        user.setId(123L);
        user.setFirst_name("Lucas");
        user.setLast_name("Escobar");
        user.setEmail("asdf@gmail.com");
        user.setPassword("asdf");
        user.setCel("300123123");

        User user2 = new User();
        user.setId(4124L);
        user.setFirst_name("Miguel");
        user.setLast_name("Restre");
        user.setEmail("miguelk@gmail.com2");
        user.setPassword("asdf2");
        user.setCel("32312231");
        
        users.add(user);
        users.add(user2);
        return users;
    }
    @RequestMapping(value = "user1234")
    public User deleteUser(){
        User user = new User();
        user.setFirst_name("Lucas");
        user.setLast_name("MM");
        user.setEmail("asdf@gmail.com");
        user.setPassword("asdf");
        user.setCel("300123123");
        
        return user;
    }
    @RequestMapping(value = "user123")
    public User putUser(){
        User user = new User();
        user.setFirst_name("Lucas");
        user.setLast_name("MM");
        user.setEmail("asdf@gmail.com");
        user.setPassword("asdf");
        user.setCel("300123123");
        
        return user;
    }
    @RequestMapping(value = "user12")
    public User searchUser(){
        User user = new User();
        user.setFirst_name("Lucas");
        user.setLast_name("MM");
        user.setEmail("asdf@gmail.com");
        user.setPassword("asdf");
        user.setCel("300123123");
        
        return user;
    }
    
}
