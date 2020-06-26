package com.havi.service;

import com.havi.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    List<Book> getBookList();
}
