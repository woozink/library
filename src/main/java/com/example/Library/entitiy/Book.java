package com.example.Library.entitiy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    public static Book book;
    private long id;
    private String name;
    private String author;
    private String page;
}
