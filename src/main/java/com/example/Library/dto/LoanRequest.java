package com.example.Library.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanRequest {
    private long userId;
    private long bookId;
}
