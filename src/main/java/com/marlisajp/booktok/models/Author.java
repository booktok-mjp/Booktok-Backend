package com.marlisajp.booktok.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "authors")
    @JsonIgnore
    private List<Book> authoredBooks;

    public Author() {
    }

    public Author(Long id, String name, List<Book> authoredBooks) {
        this.id = id;
        this.name = name;
        this.authoredBooks = authoredBooks;
    }

    public Author(String name, List<Book> authoredBooks) {
        this.name = name;
        this.authoredBooks = authoredBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getAuthoredBooks() {
        return authoredBooks;
    }

    public void setAuthoredBooks(List<Book> authoredBooks) {
        this.authoredBooks = authoredBooks;
    }
}
