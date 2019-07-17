package com.example.demo.codegym.danang.repository;

import com.example.demo.codegym.danang.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends CrudRepository<User, Long> {}

