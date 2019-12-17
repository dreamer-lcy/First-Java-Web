<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<base href="<%=basePath%>"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Register</title>
<style type="text/css">
body{
	background:url(images/register-bg.jpg);
}
.color{
	color:green;
}
*{
	color: white;
}
.box {
	width: 400px;
	height: 400px;
	margin: 30px auto;
	background: url(images/register-box-bg.jpg);
	padding-left: 60px;
	padding-top: 30px;
}

.describe {
	width: 60px;
	height: 50px;
	font-size: 14px;
}

.valueInput {
	width: 100px;
	height: 50px;
}

.buttonGroups {
	width: 300px;
	height: 50px;
	margin-top: 20px;
}

.resaveButton {
	width: 130px;
	height: 40px;
	color: forestgreen;
	font-size: 15px;
}

.resaveButton {
	margin-left:auto;
	margin-right:auto;
}
</style>
</head>

<body>
	<div class="box">
		<form action="registeredSucceed.jsp" method="post">
			<div>
				<table>
					<!--输入用户名 -->
					<tr align="right">
						<td class="describe">用户名:</td>
						<td class="valueInput"><input type="text" name="name" class="color" /></td>
					</tr>
					<!--输入密码 -->
					<tr align="right">
						<td class="describe">密&nbsp;&nbsp;&nbsp;码:</td>
						<td class="valueInput"><input type="password" name="password"  class="color"/>
						</td>
					<tr align="right">
						<td>请输入确认密码:</td>
					<td class="valueInput"><input type="text" name="refill"  class="color"></td>
				</table>
			</div>
			<div class="buttonGroups">
				   <input type="submit" name=register value="注册" class="resaveButton">
				</div>

		</form>
	</div>
</body>
<html>