package com.ict.controller.di.classfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
	
private	Book book;
	

	public Library() {}
		
	
	@Autowired
	public void setBook(Book book){
		this.book = book;
	
	}

	
    public void browse() {
    	
		System.out.print("도서관에서 ");
		book.read();
    }
}
