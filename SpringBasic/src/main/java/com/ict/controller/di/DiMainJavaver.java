package com.ict.controller.di;

import com.ict.controller.di.classfile.Singer;
import com.ict.controller.di.classfile.Stage;

public class DiMainJavaver {

	public static void main(String[] args) {
		
		
		
		
		Singer singer = new Singer();
		Stage stage = new Stage(singer );
		
		stage.perform();
		singer.sing();
	}

}
