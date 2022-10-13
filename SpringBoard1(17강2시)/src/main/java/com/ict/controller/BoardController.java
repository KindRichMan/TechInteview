package com.ict.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ict.domain.BoardVO;
import com.ict.domain.Criteria;
import com.ict.domain.PageMaker;
import com.ict.domain.SearchCriteria;
import com.ict.mapper.BoardMapper;
import com.ict.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller

public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/boardList")
	public String boardList(SearchCriteria cri,Model model) {
		List<BoardVO> boardList= service.getList(cri);
		model.addAttribute("boardList", boardList);
		
		
		//버튼추가
	 PageMaker pageMaker = new PageMaker();
	 pageMaker.setCri(cri);
	 int countPage = service.countPageNum(cri);
	 pageMaker.setTotalBoard(countPage);
	 model.addAttribute("pageMaker",pageMaker);
		
		
		return "boardList";
	}
	

	@GetMapping("/boardDetail/{bno}")
	public String boardDetail(@PathVariable long bno, Model model) {
		BoardVO board = service.select(bno);
		model.addAttribute("board",board);
		
		return "boardDetail";
	}
	
	@GetMapping("/boardInsert")
	public String boardInserForm() {
		return "boardForm";
	}
	
	@PostMapping("/boardInsert")
	public String boardInsert(BoardVO vo) {
          
		System.out.println("들어오는 것.  " + vo);
		service.insert(vo);
	      
		return "redirect:/boardList";
	}
	
	
	@PostMapping("/boardDelete")
	public String boardDelete(long bno,SearchCriteria cri,RedirectAttributes rttr) {
		
		rttr.addAttribute("pageNum",cri.getPageNum());
		rttr.addAttribute("searchType",cri.getSearchType());
		rttr.addAttribute("keyword",cri.getKeyword());
		
		service.delete(bno);
	return "redirect:/boardList";
	
	}
	
	@PostMapping("/boardUpdateForm")
	public String boardUpdateForm(long bno, Model model) {
		 BoardVO board = service.select(bno);
		 model.addAttribute("board",board);

		return "boardUpdateForm";
	
	}
	
	@PostMapping("/boardUpdate")
	public String boardUpdate(BoardVO board,SearchCriteria cri,RedirectAttributes rttr) {
		rttr.addAttribute("pageNum",cri.getPageNum());
		rttr.addAttribute("searchType",cri.getSearchType());
		rttr.addAttribute("keyword",cri.getKeyword());
		
		service.update(board);
		return "redirect:/boardDetail/"+board.getBno();
	}
	
	
	
	
	
	
}	
	

