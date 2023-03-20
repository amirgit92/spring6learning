package com.amir.spring6learning.bootstrap;

import com.amir.spring6learning.domain.Author;
import com.amir.spring6learning.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.amir.spring6learning.repositories.AuthorRepository;
import com.amir.spring6learning.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private  final AuthorRepository authorRepository;
    private  final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        System.out.println("Bootstrap constructor");
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setTitle("Domain Driven Design");
        book1.setIsbn("123456");
        book2.setTitle("J2EE Development without EJB");
        book2.setIsbn("654321");

        Author author1 = new Author();
        Author author2 = new Author();
        author1.setFirstName("Eric");
        author1.setLastName("Evans");
        author2.setLastName("Rod");
        author2.setLastName("Johnson");

        Author eric = authorRepository.save(author1);
        Author rod = authorRepository.save(author2);
        Book book1Saved = bookRepository.save(book1);
        Book book2Saved = bookRepository.save(book2);

        eric.getBooks().add(book1Saved);
        rod.getBooks().add(book2Saved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
    }
}
