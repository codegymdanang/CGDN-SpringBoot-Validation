package com.example.demo.codegym.danang.controller;

import com.example.demo.codegym.danang.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HomeController {

    /*
    * When Spring Boot finds an argument annotated with @Valid, it automatically
    * bootstraps the default JSR 380 implementation — Hibernate Validator — and validates the argument.
    * */

    @PostMapping("/users")
    ResponseEntity<String> addUser(@Valid @RequestBody User user) {
        // persisting the user
        return ResponseEntity.ok("User is valid");
    }

}
