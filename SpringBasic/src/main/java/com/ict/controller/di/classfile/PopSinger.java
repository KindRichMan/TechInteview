package com.ict.controller.di.classfile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PopSinger extends Singer {
	
	
	
	public void sing() {
		System.out.println("팝가수가 영어로 노래를 합니다.");
	}

}
