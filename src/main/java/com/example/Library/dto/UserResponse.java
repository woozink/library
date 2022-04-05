package com.example.Library.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private long id;
    private String name;
    private String email;
    private String password;
    private int age;
}
