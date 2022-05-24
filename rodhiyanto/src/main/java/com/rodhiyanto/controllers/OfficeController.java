
package com.rodhiyanto.controllers;

import com.rodhiyanto.models.entities.Office;
import com.rodhiyanto.services.OfficeServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/office")
public class OfficeController {

    @Autowired
    private OfficeServices officeServices;
   
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<String> postOfficeObject(@RequestBody Office office) {
        officeServices.save(office);
        return officeServices.postOfficeObject(office);
       
    }
   

}
