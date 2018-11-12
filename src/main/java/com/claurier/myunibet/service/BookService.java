package com.claurier.myunibet.service;


import com.claurier.myunibet.model.Book;
import com.claurier.myunibet.repository.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookService {
    @Autowired
    private BookRespository bookRespository;

    public List<Book> getAllBooks() {
        return bookRespository.findAll();
    }

    public boolean addBook(Book book) {
        Book save = bookRespository.save(book);

        return save != null;
    }
}
