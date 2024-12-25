package com.example.BookManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookManagment.Entity.book;
import com.example.BookManagment.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService service;
	@PostMapping("/add")
	public book addbook (@RequestBody book b) {
		return service.savebook(b);
		
	}
	@DeleteMapping("/delete")
	public void deletebook(@RequestBody book b) {
		service.deletebook(b);
	}
	
	@PutMapping("/update")
	public void updatebook(@RequestBody book b) {
		service.updatebook(b);
	}
	@GetMapping("/getall")
	public List<book> getall(){
		return service.getall();
	}
	@GetMapping("/findbyname/{b_name}")
	public book getbyname(@PathVariable String b_name) {
	 return	service.getByName(b_name);
	}
	@GetMapping("/getbyid/{id}")
	public book getbookById(@PathVariable int id) {
	return	service.getbookById(id);
	}
	@DeleteMapping("/deletebyid/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}
}
 