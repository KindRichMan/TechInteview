<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <form action="/userInfo" method="post">
     회원번호 : <input type="number" name="userNum"><br/>
     회원 아이디 :<input type="text" name="userId"><br/>
     회원 비밀번호 : <input type="text" name="userPw"><br/>
     회원 이름 :<input type="text" name="userName"><br/>
     회원 나이 : <input type="text" name="userAge"><br/>
      <input type="submit" value="전송하기">
      </form>
</body>
</html>