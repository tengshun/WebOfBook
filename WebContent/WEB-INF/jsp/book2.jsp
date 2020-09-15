<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书主页</title>

<!---------------------------------------------------------以下是CSS ---------------------------------------------------------------------->
<style type="text/css">

div.all{
padding:0 1% 1% 1%;
}

div.head{
float:left;
width:100%;
}

div.left{
border-right-style:solid;
border-right-width:1px;
border-right-color:gray;
float:left;
width:15%;
padding:1%;
font-size:12px;
}

div.content{
border-left-style:solid;
border-left-width:1px;
border-left-color:gray;
float:left;
width:78%;
}

div.navigation{
float:left;
padding:1%;
}

div.ajaxdata{
padding:1%;
clear:both;
}

div.foot{
border-top-style:solid;
border-top-width:1px;
border-top-color:gray;
clear:both;
padding:10px;
text-align:center;
}

ul{
list-style-type: none;
float:left;
}

li{
display:inline;
}

</style>
</head>

<!---------------------------------------------------------以下是JS ---------------------------------------------------------------------->
<script type="text/javascript">
var xmlhttp;
function loadXMLDoc(url,cfunc)
{
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=cfunc;
xmlhttp.open("GET",url,true);
xmlhttp.send();
}
function loadQuestion(order)
{
loadXMLDoc("loadQuestion?isbn=${book.isbn}&order=" + order,function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("ajaxdata").innerHTML=xmlhttp.responseText;
    }
  });
}
function loadPageQuestion(page,order)
{
loadXMLDoc("loadPageQuestion?isbn=${book.isbn}&page=" + page + "&order=" + order,function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("ajaxdata").innerHTML=xmlhttp.responseText;
    }
  });
}
</script>

<!---------------------------------------------------------以下是body ---------------------------------------------------------------------->
<body onload="loadQuestion('createtime desc')">
<div class="all">

	<!------------ 头 ------------->
	<div class="head">
	<%@ include file="head.jsp"%>
	</div>
	
	<!------------ 左侧图书基本信息 ------------->
	<div class="left">
	<img style="width:100%;" src="images/${book.isbn}.jpg" />
	<table>
	<tr><td>书名：</td><td>${book.title}</td></tr>
	<tr><td>作者：</td><td>${book.author}</td></tr>
	<tr><td>出版年：</td><td>${book.pressdate}</td></tr>
	<tr><td>出版社：</td><td>${book.press}（${book.presslocation}）</td></tr>
	<tr><td>定价：</td><td>${book.price}元</td></tr>
	<tr><td>语言：</td><td>${book.language}</td></tr>
	<tr><td>评分：</td><td>${book.score}</td></tr>
	</table>
	</div>

	<!------------ 右侧 ------------->
	<div class="content">	
		<!------------ 导航 ------------->
		<div class="navigation">
			<ul>
			<li onclick="loadQuestion('createtime')"><a href="#">问答</a></li>
			<li><a href="#">资料</a></li>
			<li><a href="#">书评</a></li>
			<li><a href="#">我的笔记</a></li>
			<li><a href="#">购买此书</a></li>
			</ul>
		</div>
		<!------------ AJAX填充区 ------------->
		<div class="ajaxdata" id="ajaxdata"></div>	
	</div>
	
	<!------------ 页脚 -------------> 
	<div class="foot">
	<%@ include file="foot.jsp"%>
	</div>
	
</div>
</body>
</html>