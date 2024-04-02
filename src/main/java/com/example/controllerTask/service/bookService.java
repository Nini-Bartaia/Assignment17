package com.example.controllerTask.service;
import com.example.controllerTask.item.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.ArrayList;
import java.util.List;

@Service
public class bookService {


    private final AnimalService animalService;
    public static final List<Book> books = new ArrayList<>();

    public bookService(@Qualifier("catService") AnimalService animalService) {
        this.animalService = animalService;
    }

    public Book createBook(Book book) {
        books.add(book);

        return book;
    }


    public void deleteBook(int index) {

        books.remove(index);
    }

    public Book updateBook(@PathVariable("bookIndex") int index, @RequestBody Book book) {

        if (index < books.size() && index > -1) {

            Book oldBook = books.get(index);
            oldBook.setAuthor(book.getAuthor());
            oldBook.setTitle(book.getTitle());
            oldBook.setPublicationDate(book.getPublicationDate());

        }

        return book;

    }


    public Book getBook(int index){

        return books.get(index);
    }

    public List<Book> getBooks(){

        return books;
    }


  

}
