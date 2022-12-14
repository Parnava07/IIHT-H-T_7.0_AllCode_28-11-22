package com.library.service;

import java.util.List;

import com.library.entity.Book;

public interface IBookService {
	
	Integer createBook(Book book);
	
	Book getBookById(Integer id);
	
	public List<Book> getAllBooks();
	
	Book updateBook(Book book,Integer id);
	
	Book updateBorrowedStatus(Book book,Integer id);
	
	public void deleteBook(Integer id);

}
