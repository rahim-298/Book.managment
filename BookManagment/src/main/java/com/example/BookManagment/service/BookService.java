package com.example.BookManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.BookManagment.Entity.book;
import com.example.BookManagment.Reposetry.BookInterface;

@Service
public class BookService {
	
	@Autowired
	BookInterface repo;
	public book savebook(book b) {
		book books = repo.save(b);
		return b;
		
	}
	public void deletebook(book b) {
		repo.delete(b);
		 
	}
public void updatebook( book b) {
		repo.save(b);
	}
public List<book> getall(){
List<book> b = repo.findAll();
return b;
}
public book getByName(String b_name) {
 return	repo.findByTitle(b_name);
}
public book getbookById( int id) {
	return repo.findById(id).orElse(null);
	
}
public void deleteById( int id) {
	repo.deleteById(id);
}


	

}
