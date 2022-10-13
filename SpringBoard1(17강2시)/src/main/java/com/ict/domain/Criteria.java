package com.ict.domain;

import lombok.Data;

@Data
public class Criteria {
	
	private int pageNum = 1;
	private int number = 10; // 페이지에 보여줄 것10개 보여준다.
	
	
	public int getPageStart() {
		return(this.pageNum -1)* number;
	}

	
	public int getPageEnd() {
		return(this.pageNum * number);
	}
	
	
	
}
