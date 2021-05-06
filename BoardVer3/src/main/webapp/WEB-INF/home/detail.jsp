<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내용보기</title>
</head>
<body>
<h1> 내용보기 </h1>
<a href="/list"><button> 목록보기 </button></a>
 
 	
 	<div>
   	제목 : ${data.title}
 	</div>
 	<div>
 	내용 : ${data.ctnt}
 	</div>
 	<div>
 	작성일 : ${data.regdt}
 	</div>
 	
 <div>
 <a href="/delete?iboard=${param.iboard}">삭제</a>
 <a href="/mod?iboard=${param.iboard}">수정</a>
 </div>
</body>
</html>