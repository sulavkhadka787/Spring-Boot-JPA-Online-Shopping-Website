package com.springcms.shoppingcart.models;

import com.springcms.shoppingcart.models.data.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

    User findByUsername(String username);
    
}
