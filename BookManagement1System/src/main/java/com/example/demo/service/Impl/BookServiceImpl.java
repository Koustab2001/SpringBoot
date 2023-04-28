package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bookrepository.BookRepository;
import com.example.demo.bookservice.BookService;
import com.example.demo.entity.Book;

public class BookServiceImpl implements BookService{
	@Autowired
	BookRepository bookRepo;
	
	@Override
	public Book addBook(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

}
