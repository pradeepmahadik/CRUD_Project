package com.example.OneToManyRestAPI.controller;

import com.example.OneToManyRestAPI.entity.Book;
import com.example.OneToManyRestAPI.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @PostMapping("/create")
    public String createBook(@RequestBody Book book){
        bookRepo.save(book);
        return "Book Created";
    }


}
