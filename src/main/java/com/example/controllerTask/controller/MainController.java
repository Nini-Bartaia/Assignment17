package com.example.controllerTask.controller;

import com.example.controllerTask.service.bookService;
import com.example.controllerTask.item.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

private final bookService bookService;


    public MainController(bookService bookService) {


        this.bookService = bookService;
    }





@PostMapping("/create-book")
public Book createBook(@RequestBody Book book){
    bookService.createBook(book);
    return book;

}

@DeleteMapping("/delete-book/{bookIndex}")
public void deleteBook(@PathVariable("bookIndex") int index){
    bookService.deleteBook(index);
}

@PutMapping("/update-book/{bookIndex}")
public Book updateBook(@PathVariable("bookIndex") int index, @RequestBody Book book){

    return bookService.updateBook(index, book);
}

@GetMapping("/get-book/{bookIndex}")
public Book getBook(@PathVariable("bookIndex") int bookIndex)
{
    return bookService.getBook(bookIndex);
}

@GetMapping("/get-book/")
public List<Book> getBooks(){
    return bookService.getBooks();

}





}
