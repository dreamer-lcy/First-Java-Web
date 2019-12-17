<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%><html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Login</title>
<style type="text/css">
.box {
	width: 300px;
	height: 200px;
	margin: 120px auto;
	background: url(images/box-bg.jpg);
	border: 2px solid gainsboro;
}

.nameInput, .passwordInput {
	width: 200px;
	height: 38px;
	margin-top: 5px;
	margin-left: 50px;
	color: gainsboro;
}

.loginButton {
	width: 200px;
	height: 40px;
	margin-top: 5px;
	margin-left: 52px;
}

body {
	background: url(images/bg.jpg);
}
</style>
<script>
	//判断是登录账号和密码是否为空
	function check() {
		var name = $("#name").val();
		var password = $("#password").val();
		if (name == "" || password == "") {
			alert("账号和密码不能为空! ");
			return false;
		}
	}
</script>
</head>
	<div class="box">
		<!-- 顶部盒子 -->
		<div></div>
		<!-- content盒子 -->
		<div>
			<form action="loginsuccess.jsp" method="post">
				<div>
					<input type="text" name="name" value="请输入用户名" class="nameInput"></input>
				</div>
				<div>
					<input type="password" name="password" value="请输入密码"
						class="passwordInput"></input>
				</div>
				<div>
					<input type="submit" value="登录" class="loginButton"></input>
				</div>
			</form>
			<form action="registerServlet" method="post">
				<div>
					<p align="center"><a href="register.jsp" color=blue>注册用户</a></p>
				</div>
			</form>
		</div>
	</div>
</body>
</html>