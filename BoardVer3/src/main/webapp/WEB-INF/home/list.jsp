<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 목록 </title>
</head>
<body>
<h1> 목록 </h1>
<a href="/write"><button>글쓰기</button></a>
<table>
<tr>
<th> 번호 </th>
<th> 제목 </th>
<th> 작성일 </th>
</tr>
<c:forEach items="${list}" var="i">
<tr onclick="moveToDetail(${i.iboard})">
<td>${i.iboard } </td>
<td>${i.title } </td>
<td>${i.regdt } </td>
</tr>
</c:forEach>
</table>

<script>
	function moveToDetail(iboard){
	location.href='detail?iboard=' + iboard;}

</script>
</body>
</html>