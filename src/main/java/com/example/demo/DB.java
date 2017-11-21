package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
@Component
public class DB {

}
@Component
interface PersonDB extends MongoRepository<Person, String> {

}

