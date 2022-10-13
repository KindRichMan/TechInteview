package com.ict.controller.di.classfile;

import org.springframework.stereotype.Component;

@Component
public class Boardcast {

	private Stage stage;
	

	public Boardcast(Stage stage) {
		this.stage = stage;
	}
	
	public void onAir() {
		System.out.print("방송 송출 중인 ");
		stage.perform();
	}
}

