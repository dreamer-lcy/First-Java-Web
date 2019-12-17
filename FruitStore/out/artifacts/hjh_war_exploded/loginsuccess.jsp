<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>判断登录</title>
</head>
<body>
<%
    Statement stmt =null;
    ResultSet rs = null;
    Connection con = null;
    String name = request.getParameter("name").trim();
    String password = request.getParameter("password").trim();
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false"
                , "root", "123456");
        stmt = con.createStatement();
        rs=stmt.executeQuery("select * from user where name='"+name+"'");
        if(rs.next()){
            rs=stmt.executeQuery("select * from user where name='"+name+"' and password='"+password+"'");
            if(rs.next()){
                response.sendRedirect("ShowAllServlet");
            }else{
                out.print("密码输入错误！！！<br>"+"重新<a href=\"login.jsp\">登录</a>");
            }
        }else{
            out.print("<font color=red>"+name+"</font>用户不存在！！！<br>"+"请点击<a href=\"registered.jsp\">注册</a>");
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
