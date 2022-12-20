package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Book;
import com.library.service.IBookService;
@CrossOrigin(allowedHeaders="*",origins="*")
@RestController
public class BookController {

	@Autowired
	private IBookService bookService;

	@PostMapping("/add/book")
	Integer addBook(@RequestBody Book book) {
		Integer id = bookService.createBook(book);
		System.out.println(id);
		return id;
	}


	@GetMapping("/read/{id}")
	public Book getBookById(@PathVariable("id") Integer id) {
		Book book = bookService.getBookById(id);	
		return book;
	}

	@GetMapping("/allbooks")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateBook(@PathVariable("id") Integer id, @RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.updateBook(book, id), HttpStatus.OK);
	}

	@PutMapping("/borrow/{id}")
	public ResponseEntity<Book> updateBorrowedStatus(@PathVariable("id") Integer id, @RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.updateBorrowedStatus(book, id), HttpStatus.OK);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer id) {
		System.out.println(id);
		ResponseEntity<Book> responseEntity = new ResponseEntity<Book>(HttpStatus.OK);
		try {
			bookService.deleteBook(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;

	}

}
