package com.oops.entity;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int year;
	
	public Book(String title, String author, String publisher, int year) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
	}
	public void showBook() {
		System.out.println("title: "+title+" author: "+author+" publisher: "
	+publisher+" year: "+year);
	}
}
