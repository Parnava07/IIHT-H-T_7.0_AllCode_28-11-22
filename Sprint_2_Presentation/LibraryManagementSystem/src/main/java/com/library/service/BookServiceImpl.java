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
	public Integer createBook(Book book) {

		Book createdBook = bookRepository.save(book);
		return createdBook.getId();
	}

	@Override
	public Book getBookById(Integer id) {
		return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExceptionHandler("Book", "id", id));
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		Book existingBook = bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptionHandler("Book", "id", id));
		existingBook.setBookName(book.getBookName());
		existingBook.setAuthorName(book.getAuthorName());
		existingBook.setGenre(book.getGenre());
		existingBook.setPrice(book.getPrice());
		// existingBook.setBorrowed(book.getBorrowed());
		bookRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public Book updateBorrowedStatus(Book book, Integer id) {
		Book existingBook = bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptionHandler("Book", "id", id));
		existingBook.setBorrowed(book.getBorrowed());
		bookRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public void deleteBook(Integer id) {
		bookRepository.deleteById(id);
		
		
	}
	

}
