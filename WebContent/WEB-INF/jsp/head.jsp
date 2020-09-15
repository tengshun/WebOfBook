<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
</head>

<body>
<div style="float:left; width:100%;">
<a href="home" style="float: left; float:left; font-size: 20px; font-family: 华文彩云;">书联网 WebOfBook</a>

<c:if test="${bruser!= null}">	
<a href="exit" style="float: right">退出</a>
<span style="float: right">&nbsp;|&nbsp;</span>
</c:if>

<a href="toRegister" style="float: right">注册</a>
<span style="float: right">&nbsp;|&nbsp;</span>

<c:if test="${bruser!=null}">
<a href="#" style="float: right">欢迎 ${bruser.email }</a>
</c:if>

<c:if test="${bruser==null}">
<a href="toLogin" style="float: right">登录</a>
</c:if>

<span style="float: right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
<a href="toFeedback" style="float: right">问题反馈</a>
</div>
<div><hr/></div>
</body>
</html>