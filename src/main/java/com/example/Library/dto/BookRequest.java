package com.example.Library.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequest {
    private String name;
    private String author;
    private String page;
}
