package com.ict.controller.di.classfile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BalladSinger extends Singer {
	
	
    
	//@Qualifier("balladSinger")
	public void sing() {
		System.out.println("발라드 가수가 소몰이 창법으로 노래를 합니다.");
	}
}


