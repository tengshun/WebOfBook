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
<form action="loadPageQuestion" method="post">
第<input type="number" required="required" name="page" style="width:4em">页
<input id="text" type="search" placeholder="请输入问题"  name="bookName" size="50"/>
<input type="hidden" name="order" value="click desc"/>
<input type="hidden" name="isbn" value="${book.isbn}"/>
<input id="submit" type="submit" value="搜索"/>
<a href="toAsk">去提问</a>
排序：
<a href="loadQuestion?isbn=${book.isbn}&order=createtime desc" target="display">日期</a>
<a href="loadQuestion?isbn=${book.isbn}&order=page asc" target="display">页码</a>
<a href="loadQuestion?isbn=${book.isbn}&order=click desc" target="display">点击量</a>
</form>
<div>
<hr/>
</div>
<c:forEach items="${questionList }" var="question" varStatus="status">
<details>
<summary><a href="#">${question.questiontitle}</a></summary>
<p>${question.questionsupplement}</p>
</details>
<p>
<a href="#" onclick="loadPageQuestion(${question.page},'click desc')">第${question.page}页</a>&nbsp;&nbsp;&nbsp;
<a href="showQuestionAndAnswer?id=${question.id}">回答</a>&nbsp;&nbsp;&nbsp;
${question.createtime}
</p>

<hr/>

</c:forEach>
</body>
</html>