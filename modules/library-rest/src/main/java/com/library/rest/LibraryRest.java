package com.library.rest;

import com.library.model.Book;
import com.library.service.BookLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Component(
    service = LibraryRest.class,
    property = {
        "osgi.jaxrs.application.select=(osgi.jaxrs.name=library-rest)",
        "osgi.jaxrs.name=library-rest",
        "osgi.jaxrs.resource=true"
    }
)
@Path("/books")
public class LibraryRest {

    @Reference
    private BookLocalService bookLocalService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return bookLocalService.getAllBooks();
    }
}
