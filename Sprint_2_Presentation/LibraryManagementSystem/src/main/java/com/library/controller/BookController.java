package com.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Book;
import com.library.service.BookServiceImpl;
import com.library.service.IBookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	@PostMapping("/addbook")
	public ResponseEntity<?> createBook(@RequestBody Book book){
		return new ResponseEntity<>(bookService.createBook(book),HttpStatus.OK);
	}
	
	//need to check
	@GetMapping("/read/{id}")
	public ResponseEntity<?> getBookById(@PathVariable("id") Long id){
		Book book = bookService.getBookById(id);
		//Optional<Book> book = bookService.getBookById(id);
		if (book == null) {
			return new ResponseEntity<>("No Such Book is Present !", HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(book, HttpStatus.OK);
		}	
	}
	
	@GetMapping("/allbooks")
	public ResponseEntity<List<Book>> getAllBooks(){
		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateBook(@PathVariable("id") Long id,@RequestBody Book updatedBook){
		return new ResponseEntity<>(bookService.updateBook(id, updatedBook), HttpStatus.OK);
	}
	
	@PutMapping("/borrow/{id}")
	public ResponseEntity<?> updateBorrowedStatus(@PathVariable("id") Long id,@RequestBody Boolean isBorrowed){
		Book book = bookService.getBookById(id);
		if(book == null) {
			return new ResponseEntity<>("No Such Book is Available", HttpStatus.NOT_FOUND);
		}else {
			bookService.changeStatus(id, isBorrowed);
			return new ResponseEntity<>("The Book Status is Successfully Updated", HttpStatus.OK);		
		}
	}
	
	//need to check
//	@PutMapping("/borrow1/{id}")
//	public void changeStatus(@PathVariable Long id, @RequestBody Boolean isBorrowed) {
//		bookService.changeStatus(id,isBorrowed);
//	}
	
	@PutMapping("/borrow2/{id}")
	public ResponseEntity<?> borrowedStatus(@PathVariable("id") Long id){
		Book book = bookService.getBookById(id);
		if(book == null) {
			return new ResponseEntity<>("No Such Book is Available", HttpStatus.NOT_FOUND);
		}else {
			//bookService.changeStatus(id);
			return new ResponseEntity<>("The Book Status is Successfully Updated", HttpStatus.OK);		
		}
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable("id") Long id){
		Book book = bookService.getBookById(id);
		if(book == null) {
			return new ResponseEntity<>("No Such Book is Available", HttpStatus.NOT_FOUND);
		}else {
			bookService.deleteBook(id);
			return new ResponseEntity<>("The Book is Deleted Successfully",HttpStatus.OK);
		}
		
	}
	
	
	

}
