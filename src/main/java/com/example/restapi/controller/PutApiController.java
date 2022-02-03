package com.example.restapi.controller;

import com.example.restapi.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public UserRequest put(@RequestBody UserRequest userRequest, @PathVariable Long userId){
        System.out.println(userId);

        return userRequest;
    }
}
