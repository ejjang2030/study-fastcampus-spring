package com.litholr.study.fastcampus.spring.fastcampusspring.controller;

import com.litholr.study.fastcampus.spring.fastcampusspring.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    // ResponseEntity
    // ResponseBody
    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User();
        user.setName("eunjae");
        user.setAge(12);
        user.setAddress("패스트");
        return user;
    }
}
