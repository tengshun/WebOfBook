<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>问题编辑</title>
</head>
<body>
${sessionScope.book.title}
<form:form action="ask" method="post" modelAttribute="question" >
	<p>问题所在页<font color="red">*</font></p>
	<p><form:input path="page" type="number" min="1" required="required"/></p>
	<p>问题<font color="red">*</font></p>
	<p><form:input path="questiontitle" required="required"/></p>
	<p>问题补充(可选)</p>
	<p><form:input path="questionsupplement"/><p>
	<p><form:input path="book_isbn" value="${sessionScope.book.isbn}"/><p>
	<p><input type="submit" value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></p>
	</form:form>
	<p style="color:#ff0000">${msg }</p>
</body>
</html>