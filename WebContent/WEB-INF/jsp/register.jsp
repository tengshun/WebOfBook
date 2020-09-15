<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<jsp:include page="head.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<meta charset="UTF-8">
<script type="text/javascript">
	function refreshCode(){
		document.getElementById("code").src = "validateCode?" + Math.random();
	}
	
	function checkForm(){
		var password = document.registerForm.password.value;
		var repassword = document.registerForm.repassword.value;
		if(password != repassword){
			alert("两次密码不一致！");
		}
		document.registerForm.submit();
		return true;
	}
</script>
</head>
<body>
<div class="clearfix">
	<div class="blank20"></div>
	<div class="box4">
		<table width="100%" border="0" cellspacing="0" cellpadding="0"><%--cellspacing规定单元格之间的空白。 --%>
			<tr>
				<td width="100%" valign="bottom"><%--valign规定单元格内容的垂直排列方式。 --%>
					<h2>普通会员注册</h2>
				</td>
			</tr>
		</table>
	</div>
	<div class="blank10"></div>
	<div class="box4">
		<div class="case_11 clearfix">
			<div class="regist">
				<form:form action="register" method="post" modelAttribute="user" name="registerForm">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" class="ttbb2">
						
						<tr>
							<td width="16%" align="right"><span class="cl_f30">*</span>E-mail：</td>
							<td width="59%"><input type="text" name="email" required="required" id="textfield" class="my_txt_350" value="${buser.bemail }"/></td>
							<td width="25%">${msg }</td>
						</tr>
						<tr>
							<td align="right">&nbsp;</td>
							<td colspan="2" style="font-size:12px;padding-bottom:25px">
								（有效的E-mail地址才能收到激活码，账户在激活后才能享受网站服务。）
							</td>
						</tr>
						
						<tr>
							<td align="right"><span class="cl_f30">*</span>密码：</td>
							<td><input type="password" name="password" required="required" id="textfield2" class="my_txt_350"/></td>
							<td>${msg }</td>
						</tr>
						<tr>
							<td align="right">&nbsp;</td>
							<td colspan="2" style="font-size:12px;padding-bottom:25px">
								（为了您账户的安全，建议使用字符+数字等多种不同类型的组合，且长度大于5位。）
							</td>
						</tr>
						
						<tr>
							<td align="right"><span class="cl_f30">*</span>重复密码：</td>
							<td><input type="password" name="repassword" required="required" id="textfield3" class="my_txt_350"/></td>
							<td>${msg }</td>
						</tr>
						<tr>
							<td align="right">&nbsp;</td>
							<td colspan="2" style="font-size:12px;padding-bottom:25px">
								（确保您记住密码。）
							</td>
						</tr>
						
						<tr>
							<td align="right"><span class="cl_f30">*</span>验证码：</td>
							<td class="ared"><input type="text" name="code" required="required" id="textfield5" class="my_txt_120"/>
								<img id="code" src="validateCode"/>
								<a href="javascript:refreshCode();"><font color="blue">看不清，换一个！</font></a>
							</td>
							<td><span class="cl_f30">${codeError }</span></td>
						</tr>
						<tr>
							<td align="right">&nbsp;</td>
							<td colspan="2" class="cl_f30" style="font-size:12px;padding-bottom:25px"></td>
						</tr>
						
						<tr>
							<td align="right">&nbsp;</td>
							<td height="50"><input type="button" name="button" id="button" onclick="checkForm()" value="注册账号" class="my_annl"/></td>
							<td>&nbsp;</td>
						</tr>
					</table>
				</form:form>
				<div class="blank20"></div>
			</div>
		</div>
	</div>
	<div class="blank10"></div>
</div>
</body>
</html>