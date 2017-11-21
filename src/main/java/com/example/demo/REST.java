package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class REST {
    private final PersonDB personDB;

    @Autowired
    public REST(PersonDB personDB) {
        this.personDB = personDB;
    }

    @PostMapping(value = "addPerson")
    @CrossOrigin
    public Person addPerson(@RequestBody Person person ) {
        person = personDB.save(person);
        return person;
    }
    @GetMapping(value = "hello")
    @CrossOrigin
    public String hello() {
        return "hello from service!";
    }
}
