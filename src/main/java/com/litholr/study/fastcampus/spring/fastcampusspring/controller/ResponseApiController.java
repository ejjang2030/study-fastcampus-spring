package com.litholr.study.fastcampus.spring.fastcampusspring.controller;

import com.litholr.study.fastcampus.spring.fastcampusspring.dto.User;
import jdk.jshell.Snippet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/response")
public class ResponseApiController {
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user;
    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
