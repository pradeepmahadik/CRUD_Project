package com.example.OneToManyRestAPI.controller;

import com.example.OneToManyRestAPI.entity.Author;
import com.example.OneToManyRestAPI.entity.Book;
import com.example.OneToManyRestAPI.repo.AuthorRepo;
import com.example.OneToManyRestAPI.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    BookRepo bookRepo;

    @PostMapping("/create")
    public String createAuthor(@RequestBody Author author){


        Author author1 = new Author(author.getAuthorId(),author.getAuthorName(),author.getAuthorEmail());

        List<Book> books = new ArrayList<>();

        for (Book books1: author.getBooks()){
            Book book = new Book(books1.getBookId(),books1.getBookName(),books1.getBookPrice());
            book.setAuthor(author1);
            books.add(book);
        }

        author1.setBooks(books);

        authorRepo.save(author1);
//        authorRepo.save(author);

        return "Author Created";
    }
}
