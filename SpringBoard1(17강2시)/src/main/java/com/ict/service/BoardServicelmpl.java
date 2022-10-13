package com.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.domain.BoardVO;
import com.ict.domain.Criteria;
import com.ict.domain.SearchCriteria;
import com.ict.mapper.BoardMapper;


@Service
public class BoardServicelmpl implements BoardService{
	
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardVO> getList(SearchCriteria cri) {
		
		return boardMapper.getList(cri);
	}

	
	public int countPageNum(SearchCriteria cri) {
		return boardMapper.countPageNum( cri);
	}

	
	public BoardVO select(long bno) {
		return boardMapper.select(bno);
	}
		 
	

	
	public void insert(BoardVO vo) {
		boardMapper.insert(vo);
	}

	
	public void delete(long bno) {
		boardMapper.delete(bno);
		
	}

	@Override
	public void update(BoardVO vo) {
		boardMapper.update(vo);
	}

	@Override
	public void datail(long bno) {
		boardMapper.datail(bno);
		
	}


	

}
