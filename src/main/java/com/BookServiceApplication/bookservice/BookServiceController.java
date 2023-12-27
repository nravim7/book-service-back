package com.BookServiceApplication.bookservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookServiceController {
    @Autowired
    private BookServiceService bookServiceService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookServiceService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable String id) {
        return bookServiceService.getBook(id);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookServiceService.addBook(book);
    }
}
