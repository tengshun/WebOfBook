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
<div style="float:left;margin-left:auto;margin-right:auto;width:100%;text-align:center;">
<form action="searchBook" method="post">
<input id="text" type="search" placeholder="请输入书名或关键字"  required="required" value="${sessionScope.bookName }" name="bookName" size="50"/>
<input id="submit" type="submit" value="搜索"/>
</form>
</div>
<div style="float:left;margin-left:auto;margin-right:auto;width:100%;text-align:center;">
共${totalCount }条记录
</div>
<table style="float:left;margin-left:auto;margin-right:auto;width:100%;text-align:center;">
<tr><th>书名</th><th>同名数量</th></tr>
<c:forEach items="${books }" var="book" varStatus="status">
<tr><td><a href="booksdetail?bookAllName=${book.title }">${book.title}</a></td><td><a href="booksdetail?bookAllName=${book.title }">${book.count}</a></td></tr>
</c:forEach>
</table>

<div style="float:left;margin-left:auto;margin-right:auto;width:100%;text-align:center;">
共${totalPage }页&nbsp;&nbsp;
第${pageCur }页&nbsp;&nbsp;
<c:url var="url_pre" value="searchBook">
	<c:param name="bookName" value="${sessionScope.bookName }"/>
	<c:param name="pageCur" value="${pageCur-1 }"/>
</c:url>
<c:url var="url_next" value="searchBook">
	<c:param name="bookName" value="${sessionScope.bookName }"/>
	<c:param name="pageCur" value="${pageCur+1 }"/>
</c:url>
<c:if test="${pageCur != 1 }">
	<a href="${url_pre }">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<c:if test="${pageCur != totalPage && totalPage !=0}">
	<a href="${url_next }">下一页</a>
</c:if>
</div>

</body>
</html>