package com.rodhiyanto.models.repos;

import com.rodhiyanto.models.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long>{
    
}
