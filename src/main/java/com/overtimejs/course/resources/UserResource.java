package com.overtimejs.course.resources;

import com.overtimejs.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Jean", "jean@overtime.com", "9999999", "passpass");
           return ResponseEntity.ok().body(user);
    }
}
