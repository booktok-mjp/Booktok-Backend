package com.marlisajp.booktok.services;

import com.marlisajp.booktok.models.Book;
import com.marlisajp.booktok.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
}
