package com.ict.mapper;

import java.util.List;

import com.ict.domain.BoardVO;
import com.ict.domain.Criteria;
import com.ict.domain.SearchCriteria;

public interface BoardMapper {
	
	public List<BoardVO> getList(); 
	
	public void insert(BoardVO vo);
	
	//public BoardVO select(long bno);
	
	//public void delete(long bno);
	
	//public void update(BoardVO vo);
	
	//public void datail(long bno);
	
	
	// 전체 글 개수 얻어오는것
	//public int countPageNum(SearchCriteria cri);

}
