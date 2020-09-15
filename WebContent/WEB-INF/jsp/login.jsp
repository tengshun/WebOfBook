<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>  
<jsp:include page="head.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>登录页面</title>
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
table{
		text-align: center;
	}
	.textSize{
		width: 200px;
		height: 20px;
	}
	#teng{
		margin:0 auto;
		width:50%;
	}
</style>
<script type="text/javascript">
	function gogo(){
		document.loginform.submit();
	}
	function cancel(){
		document.loginform.action="";
	}
	function refreshCode(){
		document.getElementById("code").src="validateCode?" + Math.random();
	}
</script>
</head>
<body>
<div id="teng">
	<form:form action="login" method="post" modelAttribute="user" name="loginform"><%--与register.jsp页面使用同一个modelAttribute="user" --%>
		<table>
			<tr>
				<td colspan="2"><img src="images/login.gif"/></td>
			</tr>
			<tr>
				<td>E-mail：</td>
				<td><input type="text" name="email" value="${user.email }"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" class="textSize"/></td>
			</tr>
			<tr>
				<td>验证码：</td>
				<td><input type="text" name="code" class="textSize"/></td>
			</tr>
			<tr>
				<td><input type="hidden" name="lastPath" value="${lastPath}"/></td>
			</tr>
			<!-- lastPath存放请求login.jsp之前的那个请求路径，登录成功后返回到那里 -->
			<tr>
				<td>
					<img id="code" src="validateCode"/>
				</td>
				<td class="ared">
					<a href="javascript:refreshCode();"><font color="blue">看不清，换一个！</font></a>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="image" src="images/ok.gif" onclick="gogo()"/>
					<input type="image" src="images/cancel.gif" onclick="cancel()"/>
				</td>
			</tr>
		</table>
	</form:form>
	<p style="color:#ff0000">${msg }</p>
</div>
</body>
</html>