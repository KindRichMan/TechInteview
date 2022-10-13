package com.ict.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.ict.domain.TestVO;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Hello";
	}

	@RequestMapping("/sendVO")
	public TestVO sendTestVO() {
		TestVO testVO = new TestVO();
		
		testVO.setMno(1);
		testVO.setName("김무환");
        testVO.setAge(22);
        
        return testVO;
        
	}
	
	@RequestMapping("/sendVOList")
	public List<TestVO> sendVOList(){
		List<TestVO> list = new ArrayList<>();
		  for(int i = 0; i < 10; i++) {
			  TestVO vo = new TestVO();
			  vo.setMno(i);
			  vo.setName(i + "종훈");
			  vo.setAge(30 + i);
			  list.add(vo);
		  }
		return list;
		
	}
	
	@RequestMapping("/sendMap")
	public Map<Integer, TestVO> sendMap(){
		Map<Integer, TestVO> map = new HashMap<>(); 
		
		for(int i = 0; i<10; i++) {
			TestVO vo = new TestVO();
			vo.setName("김무달");
			vo.setAge(50+i);
			vo.setMno(i);
			map.put(i, vo);
			
		}	
		return map;
		}	
			
	
	
	           @RequestMapping("/sendErrorAuth")
			public ResponseEntity<Void> sendListAuth(){
				
	        	   return 
						new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	        	   
				
	}
		
		
	      @RequestMapping("/sendErrorNot")
	      public ResponseEntity<List<TestVO>> sendListNot(){
	    	  List<TestVO> list = new ArrayList<>();
	    	  for(int i =0; i < 10; i++) {
	    		  TestVO vo = new TestVO();
	    		  vo.setMno(i);
	    		  vo.setName(i +"김무달");
	    		  vo.setAge(20+i);
	    		  list.add(vo);
	    	  }
	    	  return
	    			new ResponseEntity<List<TestVO>>(list, HttpStatus.NOT_FOUND);
	      }
	       
	
	}
	
	
	
	


		
		
		
		
		
		
		
			
		
	
