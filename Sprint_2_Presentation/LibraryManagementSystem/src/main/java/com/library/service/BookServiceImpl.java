package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Book;
import com.library.exception.ResourceNotFoundExceptionHandler;
import com.library.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookRepository bookRepository;

	@Override
	public Book createBook(Book newBook) {
		return bookRepository.save(newBook);
	}

	@Override
	public Book getBookById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(Long id, Book updatedBook) {
		
		Book existingBook =bookRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Book", "id", id));
		existingBook.setBookName(updatedBook.getBookName());
		existingBook.setAuthorName(updatedBook.getAuthorName());
		existingBook.setGenre(updatedBook.getGenre());
		existingBook.setPrice(updatedBook.getPrice());
		existingBook.setBorrowed(updatedBook.getBorrowed());
		return bookRepository.save(existingBook);
	}

	@Override
	public void changeStatus(Long id, Boolean isBorrowed) {
		bookRepository.updateBorrowedStatusById(isBorrowed,id);
		
	}

	@Override
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}

}
