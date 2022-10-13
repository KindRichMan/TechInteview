

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  	
  

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div class="container">
         <h1 class="text text-primary">${board.name }원생 정보조회중</h1>
          <div class="row">
             <div class="col-md-9">
                 <input type="text" class="form-control" value="이름 : ${board.name }"/>
             </div>
             <div class="col-md-9">
                 <input type="text" class="form-control" value="주소 : ${board.address }"/>
             </div> 
             <div class="col-md-9">
                 <input type="text" class="form-control" value="주소 : ${board.university }"/>
             </div> 
             <div class="col-md-9">
                 <input type="text" class="form-control" value="전공 : ${board.major }"/>
             </div> 
                <div class="row">
	              <div class="col-md-3">등록일 : ${board.regdate}</div>
	              <div class="col-md-3"></div>
	            </div> 
	            <form action="/boardDelete" method="post">
	               <input type="hidden"
	                   value="${board.bno}" name="bno"/>
	               <input type="submit" value="삭제" class="btn btn-warning">    
	            </form>
          </div> 
      </div>  
    
</body>
</html>