<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="head.jsp"%>
<c:forEach items="${booksdetail}" var="book" varStatus="status">
<table>
<tr>
	<td>书名：</td>
	<td><a href="book?isbn=${book.isbn }">
		${book.title}
		<c:if test="${book.edition > 1}">
			（第${book.edition}版）
		</c:if>
	</a></td>
</tr>
<tr><td>作者：</td><td>${book.author}</td></tr>
<tr><td>出版年：</td><td>${book.pressdate}</td></tr>
<tr><td>出版社：</td><td>${book.press}（${book.presslocation}）</td></tr>
<tr><td>定价：</td><td>${book.price}元</td></tr>
<tr><td>语言：</td><td>${book.language}</td></tr>
<tr><td>评分：</td><td>${book.score}</td></tr>
</table>
<hr/>
</c:forEach>
</body>
</html>