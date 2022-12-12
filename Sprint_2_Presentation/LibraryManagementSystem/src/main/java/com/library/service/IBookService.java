package com.library.service;

import java.util.List;

import com.library.entity.Book;

public interface IBookService {
	
	public Book createBook(Book newBook);
	
	public Book getBookById(Long id);
	
	public List<Book> getAllBooks();
	
	public Book updateBook(Long id,Book updatedBook);
	
	public void changeStatus(Long id,Boolean isBorrowed);
	
	public void deleteBook(Long id);

}
