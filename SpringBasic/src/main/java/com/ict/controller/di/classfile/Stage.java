package com.ict.controller.di.classfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Stage {
	
//	@Autowired  //3버전에서 필요함
//	@Qualifier("balladSinger")
	private Singer singer;
	
	//3버전에서는 빈 메서드 생성해야됨.
	public Stage() {
		
	}
	
	public Stage(Singer singer) {
		this.singer= singer;
	}
	
	public void perform() {
		System.out.print("무대에서 ");
		this.singer.sing();
	}

}
