package com.example.OneToManyRestAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Book3")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    private float bookPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

    public Book() {
    }

    public Book(int bookId, String bookName, float bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }
}
