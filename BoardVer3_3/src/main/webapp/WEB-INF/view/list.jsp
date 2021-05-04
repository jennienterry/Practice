<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
<style>
table, td, th {
	border: 1px solid black;
	border-collapse: collapse;
}

.record {
	cursor: pointer;
}

.record:hover {
	background-color: #ecf0f1;
}
</style>
</head>
<body>
	<h1>목록</h1>
	<div>
		<a href="/write"><button>글쓰기</button></a>
	</div>
	<div>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
			</tr>

			<c:forEach items="${list}" var="i">
				<tr class="record" onclick="moveToDetail(${i.iboard})">
					<td>${i.iboard}</td>
					<td>${i.title}</td>
					<td>${i.regdt}</td>
				</tr>
				
			</c:forEach>
		</table>
	</div>
	<script>
		function moveToDetail(iboard){
		console.log('iboard : %d', iboard);
			location.href='/detail?iboard=' + iboard;
		}
	</script>
</body>
</html>