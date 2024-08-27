package com.marlisajp.booktok.repositories;

import com.marlisajp.booktok.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
