package com.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {
	@RequestMapping(value="/goA")
	  public String goA() {
		System.out.println("goA 접속이 감지되었습니다.");
		
		
		return"goA";
				
	}
	
	@RequestMapping(value="/goB")
	public String goB() {
		System.out.println();
		return "b";
				
	}

	@RequestMapping(value="/kim")
	public String Mu() {
		return "hwan";
				
	}
	
	@RequestMapping(value="/getDate")
	   public String getDate(String data1, int data2) {
		       System.out.println("data1에 든 값 :" +  data1);
		       System.out.println("data2에 든 값 :" +  data2);
		       System.out.println("data2가 정수임을 증명 :" + (data2+100));
		       
		       return "getResult";
		    		
		}       
		    @RequestMapping(value="/getMoney")
		    public String getMoney(int won, Model model) {
		    	
		    	System.out.println("입력한 금액은 "+ won +"원입니다.");
		    	System.out.println("현재 바트화 환율은 39.15원당 1바이트입니다.");
		    	System.out.println("입력한 금액에 따른 환전금액은" +(won/39.16)+"바트입니다.");
		    	double result
		    	model.addAttribute("won",(won/36.16));
		    	
		    			
		    	return "exchange";
		    }
		     
	
	
	
	
	
	
	
	
	
	
}
