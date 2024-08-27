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
            author1.setImgUrl("https://dl6pgk4f88hky.cloudfront.net/2021/06/2020_50_orwell_opener_new-scaled.jpg");

            Author author2 = new Author();
            author2.setName("George R.R Martin");
            author2.setImgUrl("https://media.vanityfair.com/photos/62fa8f172d8966f073e581bb/master/w_1920,c_limit/george-r-r-martin-portrait-redux.jpg");

            Author author3 = new Author();
            author3.setName("J.R.R. Tolkien");
            author3.setImgUrl("https://variety.com/wp-content/uploads/2017/07/j-rr-tolkein.jpg?w=1000&h=562&crop=1");

            authorRepository.saveAll(Arrays.asList(author1, author2, author3));

            Book book1 = new Book();
            book1.setTitle("1984");
            book1.setAuthors(List.of(author1));
            book1.setImgUrl("https://m.media-amazon.com/images/I/7180qjGSgDL._SL1360_.jpg");
            book1.setDescription("A dystopian social science fiction novel and cautionary tale about the dangers of totalitarianism.");

            Book book2 = new Book();
            book2.setTitle("A Game of Thrones");
            book2.setAuthors(List.of(author2));
            book2.setImgUrl("https://images.booksense.com/images/689/381/9780553381689.jpg");
            book2.setDescription("A Game of Thrones is the first novel in A Song of Ice and Fire, a series of fantasy novels by American author George R. R. Martin.");


            Book book3 = new Book();
            book3.setTitle("Fire and Blood");
            book3.setAuthors(List.of(author2));
            book3.setImgUrl("https://m.media-amazon.com/images/I/81sV4EKdlTL._SL1500_.jpg");
            book3.setDescription("Centuries before the events of A Game of Thrones, House Targaryen—the only family of dragonlords to survive the Doom of Valyria—took up residence on Dragonstone");

            Book book4 = new Book();
            book4.setTitle("The Lord of the Rings");
            book4.setAuthors(List.of(author3));
            book4.setDescription("An epic high fantasy novel set in Middle-earth, following the quest to destroy the One Ring.");
            book4.setImgUrl("https://i.thriftbooks.com/api/imagehandler/m/6BAA3FAC4321FC4D8F07CB0D1F0D5A10D39E74EC.jpeg");

            Book book5 = new Book();
            book5.setTitle("Fake Book Combined Authors");
            book5.setAuthors(List.of(author1,author2));
            book5.setDescription("This is a fake book to show multiple authors for one book.");

            bookRepository.saveAll(Arrays.asList(book1, book2, book3, book4, book5));
        };
    }
}
