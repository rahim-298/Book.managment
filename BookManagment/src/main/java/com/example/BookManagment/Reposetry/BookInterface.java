package com.example.BookManagment.Reposetry;

  import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookManagment.Entity.book;

@Repository
public interface BookInterface extends JpaRepository<book, Integer> {

	

	Optional<book> findById(int id);



	book findByTitle(String b_name);

}
