package com.example.restapi.controller;

import com.example.restapi.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping("/hello")
    public String hello(){
        return "get hello";
    }

    @GetMapping("/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        return pathName;
    }

    @GetMapping("/query-param")
    public String queryParam(@RequestParam("name") String name){
        return name;
    }

    @GetMapping("/user")
    public String userRequest(UserRequest userRequest){
        return userRequest.toString();
    }
}
