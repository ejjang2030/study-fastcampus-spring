package com.litholr.study.fastcampus.spring.fastcampusspring.controller;

import com.litholr.study.fastcampus.spring.fastcampusspring.dto.PostRequestDto;
import com.litholr.study.fastcampus.spring.fastcampusspring.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/post")
public class PostApiController {

    @PostMapping("/index")
    public void post(@RequestBody PostRequestDto requestData) {
        System.out.println(requestData);
    }
}
