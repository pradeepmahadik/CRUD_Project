package com.example.OneToManyRestAPI.repo;

import com.example.OneToManyRestAPI.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
}
