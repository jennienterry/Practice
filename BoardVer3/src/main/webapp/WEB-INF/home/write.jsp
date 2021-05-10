<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<h1>글쓰기</h1>
	<a href="/list"><button>목록보기</button></a>

	<div>
		<form action="/write" method="post">
			<div>
				제목 : <input type="text" name="ttitle">
			</div>
			<div>
				내용 :
				<textarea name="content" cols="10" rows="10"></textarea>
			</div>

			<div>
				<input type="submit" value="등록"> <input type="reset"
					value="초기화">

			</div>
		</form>

	</div>
</body>
</html>