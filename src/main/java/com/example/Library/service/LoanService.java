package com.example.Library.service;

import com.example.Library.dto.LoanRequest;
import com.example.Library.entitiy.Loan;
import com.example.Library.mapper.LoanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class LoanService {
    @Autowired
    private LoanMapper loanMapper;

    //대출일 , 반납 예정일
    public Loan borrowBooks(LoanRequest loanRequest){
        Loan loan = new Loan();
        loan.setReturnDateTime(null);
        loan.setReturned(false);
        loan.setLoanDateTime(LocalDateTime.now());
        loan.setExpireDateTime(LocalDateTime.now().plus(7, ChronoUnit.DAYS));
        loan.setBookId(loanRequest.getBookId());
        loan.setUserId(loanRequest.getUserId());

        loanMapper.save(loan);
        return loan;
    }

    // 책 반납
    public void returned(long id){

        loanMapper.returnBook(id);
    }

    //반납일 연장 - 반납일 7일 연장
    public Loan extend(long id){
        // 타겟 대출 기록 조회
        // 현재의 expire datetime + 7일로 새로 저장
        Loan loan = loanMapper.findById(id);
        loan.setExpireDateTime(loan.getExpireDateTime().plus(7, ChronoUnit.DAYS));
        loanMapper.extendDate(id, loan);
        return loan;
    }

    public Loan getLoan(long id){
        return loanMapper.findById(id);
    }

}
