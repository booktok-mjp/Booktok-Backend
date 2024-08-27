package com.marlisajp.booktok.config;

import com.marlisajp.booktok.models.Author;
import com.marlisajp.booktok.models.Book;
import com.marlisajp.booktok.repositories.AuthorRepository;
import com.marlisajp.booktok.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner bookCommandLineRunner(BookRepository bookRepository, AuthorRepository authorRepository) {
        return args -> {
            Author author1 = new Author();
            author1.setName("George Orwell");

            Author author2 = new Author();
            author2.setName("Aldous Huxley");

            Author author3 = new Author();
            author3.setName("J.K. Rowling");

            Author author4 = new Author();
            author4.setName("J.R.R. Tolkien");

            authorRepository.saveAll(Arrays.asList(author1, author2, author3, author4));

            Book book1 = new Book();
            book1.setTitle("1984");
            book1.setAuthors(List.of(author1));

            Book book2 = new Book();
            book2.setTitle("Brave New World");
            book2.setAuthors(List.of(author2));

            Book book3 = new Book();
            book3.setTitle("Harry Potter and the Philosopher's Stone");
            book3.setAuthors(List.of(author3));

            Book book4 = new Book();
            book4.setTitle("The Lord of the Rings");
            book4.setAuthors(List.of(author4));

            Book book5 = new Book();
            book5.setTitle("Good vs Evil");
            book5.setAuthors(Arrays.asList(author1, author4));

            bookRepository.saveAll(Arrays.asList(book1, book2, book3, book4, book5));
        };
    }
}
