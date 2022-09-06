package com.lara;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {
	private String title;
	private String author;

	public Book() {
		System.out.println("Book()");
	}

	public String getTitle() {
		System.out.println("getTitle");
		return title;
	}

	public void setTitle(String title) {
		System.out.println("setTitle");
		this.title = title;
	}

	public String getAuthor() {
		System.out.println("getAuthor");
		return author;
	}

	public void setAuthor(String author) {
		System.out.println("setAuthor");
		this.author = author;
	}

	@PostConstruct // equivalent to afterpropertySet()
	public void inti() {
		System.out.println("inti()");
	}

	@PreDestroy // equivalent to destroy()
	public void destroy() {
		System.out.println("destroy()");
	}

}
