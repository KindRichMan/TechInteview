package com.ict.controller.di;

import com.ict.controller.di.classfile.Book;
import com.ict.controller.di.classfile.Library;
import com.ict.controller.di.classfile.Singer;
import com.ict.controller.di.classfile.Stage;

public class DimainJavaver {

	public static void main(String[] args) {
/*		
		Singer s1 = new Singer();
		Stage sta1 = new Stage(s1);
		
		sta1.perform();
		s1.sing();
		
		
*/	
		Book book = new Book();
		book.read();
         
         Library library = new Library();
         library.setBook(book);
        library.browse();
	}

}
