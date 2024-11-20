package com.prodmanager.product.controllers;

import com.prodmanager.product.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Joana Maia", "jomaia@outlook.com", "55996508150", "123456");
        return ResponseEntity.ok().body(user);
    }

}
