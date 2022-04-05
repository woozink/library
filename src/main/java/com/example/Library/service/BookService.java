package com.example.Library.service;

import com.example.Library.dto.BookRequest;
import com.example.Library.entitiy.Book;
import com.example.Library.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public Book insert(BookRequest bookRequest) {
        Book book = new Book();
        book.setName(bookRequest.getName());
        book.setAuthor(bookRequest.getAuthor());
        book.setPage(bookRequest.getPage());
        bookMapper.insertBook(book);

        return book;
    }

    public List<Book> getAllBooks() {
        return bookMapper.findAllBooks();
    }

    public Book getBook(long id) {
        return bookMapper.findBookById(id);
    }

    public void deleteBook(long id) {
        bookMapper.deleteBookById(id);
    }


    public Book update(long id, BookRequest bookRequest) {
        Book book = new Book();
        if(book == null){
            return null;
        }
        else{
            book.setAuthor(bookRequest.getAuthor());
            book.setName(bookRequest.getName());
            book.setPage(bookRequest.getPage());
            bookMapper.updateBook(book);
            return book;
        }
    }
}