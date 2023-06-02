package com.litholr.study.fastcampus.spring.fastcampusspring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {
    @GetMapping("/rest/get/{id}")
    public void get(@PathVariable Long id, @RequestParam String name) {
        System.out.println();
        System.out.println();
    }

    @PostMapping("/rest/post")
    public void post() {

    }
}
