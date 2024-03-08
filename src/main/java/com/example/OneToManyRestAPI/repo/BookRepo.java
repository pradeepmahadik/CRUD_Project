package com.example.OneToManyRestAPI.repo;

import com.example.OneToManyRestAPI.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
