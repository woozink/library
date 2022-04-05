package com.example.Library.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse {
    private long id;
    private String name;
    private String author;
    private String page;
}
