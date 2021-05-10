<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내용보기</title>
</head>
<body>
	<h1>내용보기</h1>
	<div>
	 제목 : ${vo.title}
	</div>
	<div>
	 내용 : ${vo.ctnt}
	</div>
	
	<a href="/delete?no=${param.no}"><button>삭제</button></a>
	<a href="/mod?no=${param.no}"><button>수정</button></a>
</body>
</html>