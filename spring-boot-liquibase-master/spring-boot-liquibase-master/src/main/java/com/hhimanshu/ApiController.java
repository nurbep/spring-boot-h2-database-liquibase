package com.hhimanshu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hhimanshu.persistence.entities.Book;
import com.hhimanshu.persistence.repositories.BookRepository;

@RestController
public class ApiController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/")
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
		
	}

}
