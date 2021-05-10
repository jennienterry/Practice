<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정하기</title>
</head>
<body>
 <h1>수정</h1>
	<form action="/mod" method="post">
	<div>
	<input type="hidden" name="no" value="${param.no}">
	 제목 : <input type="text" name="title" value="${vo.title}" >
	 </div>
	 <div>
	 내용 : <textarea name="ctnt">${vo.ctnt}</textarea>
	 </div>
	 <input type="submit" value="수정">
	 <input type="reset" value="초기화">
	 </form>
</body>
</html>