package com.anna.persistence;

import java.util.Collection;

import com.anna.database.BookDatabase;
import com.anna.entity.Book;

public class BookDaoImpl implements BookDao{

    @Override
    public Collection<Book> listAllBooks() {
        return BookDatabase.getBookList().values();
    }


    @Override
    public Book searchBookId(int bookID) {
        return BookDatabase.getBookList().get(bookID);
    }

    @Override
    public Book addBook(Book book) {
        return BookDatabase.getBookList().put(book.getBookId(), book);
    }

}
