package com.ict.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ict.controller.vo.UserVO;

@Controller

public class BasicController {
	
	   @RequestMapping(value="/goA")
	   public String goA() {
		   System.out.println("goA 접속이 감지되었습니다.");
		   
		   return "goA";
		   	
	   }
	
	   @RequestMapping(value="/goB")
	public String goB() {
		System.out.println("goB접속");
		
		return "goBB";//goBB.JSP로 접속됨
	}
	
	@RequestMapping(value="/kim")
	public String MOO() {
		return "hwan";
	}
	
	@RequestMapping(value="/getData", method=RequestMethod.POST)

	public String getData(String data1, int data2, Model model) {
		System.out.println("data1에 든 값 : " + data1);
		System.out.println("data2에 든 값 : " + data2);
		System.out.println("data2가 정수임을 증명 : " + (data2+100));
		
		
		model.addAttribute("data1", data1);
		model.addAttribute("data2", data2);
		
		return "getResult"; 
	}

	@RequestMapping(value="/getMoney", method=RequestMethod.POST)
	public String getUSA(int won,Model model) {
		double result = (won/1200);
		System.out.println("입력한 금액은 : " + won +"입니다.");
		System.out.println("현재 달러의 환율은 1200당 1달러입니다.");
	    System.out.println("입력한 금액에 따른 환전금액은 " +result +"입니다.");
		
	    model.addAttribute("won", won);
	    model.addAttribute("result",result);
		return "exchange";
	}
	
	@RequestMapping(value="/moneyForm")
	public String getMoney() {
		return "moneyForm";
	}
	

	
	@RequestMapping(value="/dataForm1")
	public String getData() {
		return "dataForm";
	}
	
	
	
	@GetMapping(value="/onlyGet")
	public String onlyGet() {
		return "onlyGet";
	}
	
	
	@PostMapping(value="/score")
	public String score(int math,int eng,int lan, int social, int com, Model model) {
		
		int total = (math + eng + lan + social + com);
		double avg = total /5.0; 
		model.addAttribute("math",math);
		model.addAttribute("eng",eng);
		model.addAttribute("lan",lan);
		model.addAttribute("social",social);
		model.addAttribute("com",com);
		model.addAttribute("total",total);
		model.addAttribute("resultt",avg);
		
		
		return "score";
	}
	
	@GetMapping(value="/score")
	public String scoreForm() {
		return "scoreForm";
	}
	
	@GetMapping(value="/page/{pageNum}")
	public String getPage(@PathVariable int pageNum, Model model) {
		model.addAttribute("pageNum",pageNum);
		return "page";
	}
	
	
	
	@GetMapping(value="/rate/{won}")
	public String getExchang(@PathVariable int won,Model model) {
		double exe = won/42.29;
		model.addAttribute("won",won);
		model.addAttribute("exe",exe);
		return "rate";
		
	}
	
	@GetMapping("/getList")
	public String getList(
			@RequestParam("array") ArrayList<String> array, Model model) {
		model.addAttribute("array",array);
		return "getList";
	}
	
	@GetMapping(value="/test")
	public void geTest() {
		
	}
	
	@PostMapping("/userInfo")
	public String getUserInfo(UserVO userVO, Model model) {
		//model.addAttribute("userId",userId);
		model.addAttribute("userVO",userVO);
		
		return "user";
	}
	
	@GetMapping("/userForm")
	public String getUser() {
		return "userForm";
	}
	
	
	
	
	
	
	
	
}
