<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>首页</title>

<!---------------------------------------------------------以下是CSS ---------------------------------------------------------------------->
<style type="text/css">

#searchbox {
	margin-left:auto;
	margin-right:auto;
	float:left; 
	width:100%;
	padding:5% 0 5% 0;
}
p{
text-align:center;
}
</style>

<!---------------------------------------------------------以下是body ---------------------------------------------------------------------->
<body>
<%@ include file="head.jsp"%>
<form id="searchbox" action="searchBook" method="post">
<p>
<input id="text" type="search" placeholder="请输入书名或关键字"  required="required" name="bookName" size="50"/>
<input id="submit" type="submit" value="搜索"/>
<p>
</form>

<hr/>
</body>
</html>