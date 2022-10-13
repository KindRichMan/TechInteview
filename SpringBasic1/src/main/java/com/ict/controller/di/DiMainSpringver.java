package com.ict.controller.di;

import java.lang.Thread.State;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ict.controller.di.classfile.BalladSinger;
import com.ict.controller.di.classfile.Boardcast;
import com.ict.controller.di.classfile.Book;
import com.ict.controller.di.classfile.Library;
import com.ict.controller.di.classfile.PopSinger;
import com.ict.controller.di.classfile.Singer;
import com.ict.controller.di.classfile.Stage;

public class DiMainSpringver {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-*.xml");
		
	
		
//		Singer singer = context.getBean("singer",Singer.class);
//		singer.sing();
	
	
		
//		Stage stage = context.getBean("stage",Stage.class);
//		stage.perform();
		
	
//		Boardcast boardcast = context.getBean("boardcast", Boardcast.class);
//		boardcast.onAir();
		
		BalladSinger balladSinger = context.getBean("balladSinger", BalladSinger.class);
		balladSinger.sing();
		
		PopSinger popSinger = context.getBean("popSinger", PopSinger.class);
		popSinger.sing();
	/*
		Stage stage1 = context.getBean("stage1",Stage.class);
		stage1.perform();

		Stage stage2 = context.getBean("stage2",Stage.class);
		stage2.perform();
	*/
 //      Library library = context.getBean("library1",Library.class);
 //      library.browse();
	
		
	}
}

	  
	 