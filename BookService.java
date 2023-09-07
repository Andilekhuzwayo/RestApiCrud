package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Book;
import com.javatechie.crud.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public static HttpStatus return404(){
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "no prescribed book found with provided module code!!"
        );
    }
    public Book getBookByModuleCode(int moduleCode) {
        return repository.findByModuleCode(moduleCode);
    }

    public String deleteBook(int moduleCode) {
        repository.deleteByModuleCode(moduleCode);
        return "Book removed !! " + moduleCode;
    }

    public Book updateBook(int module_code, Book book) {
        Book existingBook = repository.findByModuleCode(module_code);
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setYearPublished(book.getYearPublished());
        existingBook.setEdition(book.getEdition());
        existingBook.setPublisher(book.getPublisher());
        existingBook.setPrescribedYear(book.getPrescribedYear());
        return repository.save(existingBook);
    }


}
