package guru.springframework.spring7webapp.services;

import guru.springframework.spring7webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
//    Book findBookById(Long id);
//    Book findBookByName(String name);
}
