package com.example.OneToManyRestAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Author3")
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;
    private String authorEmail;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Book> books;

    public Author() {
    }

    public Author(int authorId, String authorName, String authorEmail) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
    }

}
