package com.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(path = "/user", produces = "application/json")
    public ResponseEntity<String> getUser() {
        System.out.println("GET /user");
        return ResponseEntity.ok("{ \"name\" : \"Alexey\" }");
    }
}
