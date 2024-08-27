package com.marlisajp.booktok.repositories;

import com.marlisajp.booktok.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
