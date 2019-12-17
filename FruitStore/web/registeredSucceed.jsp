<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册成功页面</title>
</head>
<body>
<%
    Statement stmt =null;
    ResultSet rs = null;
    Connection con = null;
    String name=request.getParameter("name").trim();//去除首尾空格
    String password=request.getParameter("password").trim();
    String refill=request.getParameter("refill").trim();
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false", "root", "123456");
        stmt = con.createStatement();
        if(name!=null ){
            rs=stmt.executeQuery("select * from user where name='"+name+"'");

            if(rs.next()){
                out.print("用户已经存在  "+"请<a href=\"registered.jsp\">注册</a>");
            }else{
                if(password.equals(refill)){
                    stmt.executeUpdate("insert into user values('"+name+"','"+ password + "');");
%>
注册成功！！！<br>
三秒钟后自动转到登录页面！！！<br>
如果没有跳转，请点击<a href="login.jsp">这里</a>！！！
<span style="font-size:24px;"><meta http-equiv="refresh" content="3;URL=login.jsp"> </span>
<%
                }else{
                    out.print("密码输入不一致!!!<br>"+"重新<a href=\"registered.jsp\">注册</a>");
                }
            }
        }else {
            out.print("姓名不能为空");
        }
    }catch(Exception e){
        out.print(e);
    }finally{
        if(rs!=null)
            rs.close();
        if(stmt!=null)
            stmt.close();
        if(con!=null)
            con.close();
    }
%>

</body>
</html>
