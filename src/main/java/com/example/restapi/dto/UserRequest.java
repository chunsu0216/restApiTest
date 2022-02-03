package com.example.restapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserRequest {

    private String name;
    private String email;
    private int age;

    @JsonProperty("car_list")
    private List<Car> carList;
}
