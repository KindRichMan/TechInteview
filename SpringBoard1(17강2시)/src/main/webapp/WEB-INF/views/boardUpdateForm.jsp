<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>${vo.bno }번글 수정페이지입니다.</h1>
       ${vo }
       
       <h1>글쓰기페이지</h1>

<form action="/boardUpdate" method="post">
      <input type="hidden" name="bno" value="${board.bno }"/>
 제목 : <input type="text" value="${board.title }" name="title">
 글쓴이 : <input type="text" value="${board.writer }" name="writer"></br>
 본문 :<textarea name="content"rows="20" cols="100">${board.content } </textarea></br>
   <input type="submit" value="글 저장하기">
   
   <input type="hidden" name="pageNum" value="${param.pageNum}" >
   <input type="hidden" name="searchType" value="${param.searchType}" >
   <input type="hidden" name="keyword" value="${param.keyword}" >
  
  
</form>
       
</body>
</html>