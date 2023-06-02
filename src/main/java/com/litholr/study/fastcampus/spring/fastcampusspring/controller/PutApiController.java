package com.litholr.study.fastcampus.spring.fastcampusspring.controller;

import com.litholr.study.fastcampus.spring.fastcampusspring.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable(value="userId") Long id) {
        System.out.println(id);
        return putRequestDto;
    }
}
