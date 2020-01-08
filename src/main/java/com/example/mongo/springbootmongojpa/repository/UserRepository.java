package com.example.mongo.springbootmongojpa.repository;

import com.example.mongo.springbootmongojpa.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
