package com.backend.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.demo.dto.BookDto;

@RestController
public class BookController {
	
	@GetMapping("api/v1/books")
	public ResponseEntity<List<BookDto>> getBooks(){
		BookDto book = BookDto.builder()
				.title("First Book")
				.build();
		List<BookDto> books = new ArrayList<>();
		books.add(book);
		return ResponseEntity.ok(books);
	}
}
