package com.example.Library.entitiy;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class Loan {
    private long id;
    private long userId;
    private long bookId;
    private LocalDateTime loanDateTime;
    private LocalDateTime expireDateTime;
    private LocalDateTime returnDateTime=null;
    private boolean isReturned = false;
}
