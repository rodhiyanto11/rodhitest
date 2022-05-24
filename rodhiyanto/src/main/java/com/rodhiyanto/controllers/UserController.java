package com.rodhiyanto.controllers;

import com.rodhiyanto.models.entities.User;
import com.rodhiyanto.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")

public class UserController {

    @Autowired
    private UserServices userServices;
   
    // @CrossOrigin(origins = "http://192.168.0.104:3000")
    @PostMapping
    public ResponseEntity<String> postUserObject(@RequestBody User user) {
        userServices.save(user);
        return userServices.postUserObject(user);
       
    }
   

}
