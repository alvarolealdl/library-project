package com.library.service.impl;

import com.library.model.Author;
import com.library.service.base.AuthorLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import org.osgi.service.component.annotations.Component;

import java.util.List;

@Component(
    property = "model.class.name=com.library.model.Author",
    service = AopService.class
)
public class AuthorLocalServiceImpl extends AuthorLocalServiceBaseImpl {

    public Author addAuthor(String name, String nationality) {
        long authorId = counterLocalService.increment(Author.class.getName());

        Author author = authorPersistence.create(authorId);
        author.setName(name);
        author.setNationality(nationality);

        return authorPersistence.update(author);
    }

    public Author updateAuthor(long authorId, String name, String nationality) {
        Author author = authorPersistence.fetchByPrimaryKey(authorId);

        if (author != null) {
            author.setName(name);
            author.setNationality(nationality);
            authorPersistence.update(author);
        }

        return author;
    }

    public Author deleteAuthor(long authorId) {
    try {
        return authorPersistence.remove(authorId);
    } catch (com.library.exception.NoSuchAuthorException e) {
        return null;
    }
}


    public List<Author> getAllAuthors() {
        return authorPersistence.findAll();
    }

    public Author getAuthorById(long authorId) {
        return authorPersistence.fetchByPrimaryKey(authorId);
    }
}
