package com.rodhiyanto.services;

import javax.transaction.Transactional;

import com.rodhiyanto.models.entities.Office;
import com.rodhiyanto.models.repos.OfficeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
public class OfficeServices {
    @Autowired
    private OfficeRepo officeRepo;

    @Autowired
    private RestTemplate restTemplate;
    public ResponseEntity<String> postOfficeObject(Office office){
        String  response = restTemplate.postForObject("https://hookb.in/Z2LxoDmw1aIVQa3Wgd9K", office, String.class);
        
        return ResponseEntity.ok(response);
        
    }
    public Office save(Office office){
        return officeRepo.save(office);
    }
}
