package com.litholr.study.fastcampus.spring.fastcampusspring.controller;

import com.litholr.study.fastcampus.spring.fastcampusspring.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path="/hello") // http://localhost:9090/api/get/hello
    public String getHello() {
        return "get hello";
    }

    @RequestMapping(path="/hi", method= RequestMethod.GET) // http://localhost:9090/api/get/hi
    public String hi() {
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName) {
        System.out.println("pathVariable : " + pathName);
        return pathName;
    }

    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();
        queryParam.forEach((key, value) ->{
            System.out.println();
            sb.append(key + " : " + value + "\n");
        });
        return sb.toString();
    }

    @GetMapping("/query-param2")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    @GetMapping("/query-param3")
    public String queryParam3(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
