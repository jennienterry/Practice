<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
</head>
<body>
    <h1>목록</h1>
    <a href="/write"><button>글쓰기</button></a>
    <table>
    <tr>
    <th> 번호 <th>
    <th> 제목 </th>
    </tr>
    <c:forEach var="i" items="${data}" varStatus="status" >
    <tr>
    <td> ${status.index} </td>
    <td><a href="/detail?no=${status.index}"> ${i.title} </a></td>
    </tr>
    
    </c:forEach>
    
    
    
    </table>
</body>
</html>