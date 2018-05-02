package com.library.reservebook;

public class Book {

	private int bookid, quantity;
	private String bookname, author, publisher;

	public int getBookId() {
		return bookid;
	}

	public void setBookId(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookname;
	}

	public void setBookName(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
