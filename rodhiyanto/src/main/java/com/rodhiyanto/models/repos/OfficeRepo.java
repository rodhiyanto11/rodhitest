
// package com.rodhiyanto.models.repos;

// import com.rodhiyanto.models.entities.Office;

// import org.springframework.data.repository.CrudRepository;

// public interface OfficeRepo extends CrudRepository<Office,Long>{
    
// }



package com.rodhiyanto.models.repos;

import com.rodhiyanto.models.entities.Office;
import com.rodhiyanto.models.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface OfficeRepo extends CrudRepository<Office,Integer>{
    
}
