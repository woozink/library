package com.example.Library.entitiy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private long id;
    private String name;
    private String email;
    private String password;
    private int age;
}
