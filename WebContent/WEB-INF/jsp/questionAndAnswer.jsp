<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function loadXMLDoc()
{
var xmlhttp;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("thumbup").innerHTML="点赞(" + "${answer.thumbup } + 1" + ")";
    }
  }
xmlhttp.open("POST","/answerThumbup",true);
xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
xmlhttp.send("user_id=id&answer_id=${answer.id }");
}
</script>

</head>
<body>

提问者：${question.user_id }<br>
问题：<br>
&nbsp&nbsp&nbsp&nbsp ${question.questiontitle }<br>
问题补充：<br>
&nbsp&nbsp&nbsp&nbsp ${question.questionsupplement }<br>
&nbsp&nbsp&nbsp&nbsp&nbsp 书上${question.page }页 &nbsp&nbsp ${question.createtime }<br>
<hr>
<hr>

<form:form action="addAnswer" method="post" modelAttribute="answer" >
	<fieldset>
	<legend>输入回答</legend>
	<p><form:hidden path="question_id" value="${question.id }" required="required"/></p>
	<p><form:textarea path="value" required="required" cols="100"/></p>
	<p><input type="submit" value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></p>
	</fieldset>
</form:form>
<br>
<br>

共有 ${answer_num } 条回答<br>
<hr>
<c:forEach items="${answers }" var="answer" varStatus="status">
${answer.value }<br>
<button type="button" id="thumbup" onclick="loadXMLDoc()">点赞(${answer.thumbup })</button>  &nbsp&nbsp回复&nbsp&nbsp${answer.createtime }<br>
<hr>
</c:forEach>

</body>
</html>