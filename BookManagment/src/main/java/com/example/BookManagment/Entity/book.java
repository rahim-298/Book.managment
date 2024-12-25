package com.example.BookManagment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class book {
	@Id
	private int id;
	private String title;
	private String author;
	private int price;
	public book() {
		super();
	}
	
	public book(int id) {
		super();
		this.id = id;
	}

	public book(int id, String b_name, String author, int price) {
		super();
		this.id = id;
		this.title = b_name;
		this.author = author;
		this.price = price;
	}
	public book(String b_name, String author, int price) {
		super();
		this.title = b_name;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB_name() {
		return title;
	}
	public void setB_name(String b_name) {
		this.title = b_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", b_name=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	

}
