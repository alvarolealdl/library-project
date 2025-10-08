package com.library.service.impl;

import com.library.model.Book;
import com.library.service.base.BookLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import org.osgi.service.component.annotations.Component;

import java.util.List;

@Component(
    property = "model.class.name=com.library.model.Book",
    service = AopService.class
)
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {

    public Book addBook(String title, int publicationYear, long authorId) {
        long bookId = counterLocalService.increment(Book.class.getName());

        Book book = bookPersistence.create(bookId);
        book.setTitle(title);
        book.setPublicationYear(publicationYear);
        book.setAuthorId(authorId);

        return bookPersistence.update(book);
    }

    public Book updateBook(long bookId, String title, int publicationYear, long authorId) {
        Book book = bookPersistence.fetchByPrimaryKey(bookId);

        if (book != null) {
            book.setTitle(title);
            book.setPublicationYear(publicationYear);
            book.setAuthorId(authorId);
            bookPersistence.update(book);
        }

        return book;
    }

    public Book deleteBook(long bookId) {
        try {
            return bookPersistence.remove(bookId);
        } catch (com.library.exception.NoSuchBookException e) {
            return null;
        }
    }

    public List<Book> getAllBooks() {
        return bookPersistence.findAll();
    }

    public List<Book> getBooksByAuthor(long authorId) {
        return bookPersistence.findByAuthorId(authorId);
    }

    public Book getBookById(long bookId) {
        return bookPersistence.fetchByPrimaryKey(bookId);
    }
}
