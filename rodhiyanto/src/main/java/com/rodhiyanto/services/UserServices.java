package com.rodhiyanto.services;

import javax.transaction.Transactional;

import com.rodhiyanto.models.entities.User;
import com.rodhiyanto.models.repos.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
public class UserServices {

@Autowired
   private UserRepo userRepo;
   @Autowired
   private RestTemplate restTemplate;
    

   public ResponseEntity<String> postUserObject(User user){
    String  response = restTemplate.postForObject("https://hookb.in/Z2LxoDmw1aIVQa3Wgd9K", user, String.class);
    
    return ResponseEntity.ok(response);
    
}

   public User save(User user){
       return userRepo.save(user);
   }
  
    
    
}   
