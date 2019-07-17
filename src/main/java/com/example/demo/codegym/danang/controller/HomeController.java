package com.example.demo.codegym.danang.controller;

import com.example.demo.codegym.danang.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

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

    @GetMapping("/user/{id}")
    ResponseEntity<String> findOne(@PathVariable @Min(1) Long id) { //jsr 303 annotations
        return ResponseEntity.ok("Param is valid");
    }

}
