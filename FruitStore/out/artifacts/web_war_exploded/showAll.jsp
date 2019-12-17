<%--
  Created by IntelliJ IDEA.
  Author: 黄继红
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        input{
            height: 30px;
            font-size: 20px;
        }
        li{
            display: inline-block;
        }
    </style>
</head>
<body style="margin: 20px auto;width: 900px">
    <h2>JSP_JDBC CRUD操作</h2>
    <div>
        <form action="/QueryProductServlet" method="post">
            <input name="keyword">
            <input type="submit" value="搜索">
        </form>
    </div>
    <div>
        <c:choose>
            <c:when test="${empty requestScope.list}">
                <p>数据为空</p>
            </c:when>
            <c:otherwise>
                <table border="1" cellpadding="5" cellspacing="0">
                    <tr>
                        <th>商品ID号</th>
                        <th>商品名称</th>
                        <th>商品价格</th>
                        <th>当前价格</th>
                        <th>商品描述</th>
                        <th>创建时间</th>
                        <th>更新时间</th>
                        <th colspan="2">操作</th>
                    </tr>
                    <c:forEach items="${requestScope.list}" var="product">
                        <tr>
                            <td>${product.id}</td>
                            <td>${product.name}</td>
                            <td>${product.price}</td>
                            <td>${product.currentPrice}</td>
                            <td>${product.description}</td>
                            <td>${product.createDate}</td>
                            <td>${product.updateDate}</td>
                            <td><a href="/FindProductServlet?id=${product.id}">修改</a></td>
                            <td><a href="/DeleteProductServlet?id=${product.id}">删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </c:otherwise>
        </c:choose>
    </div>
    <div>
        <ul>
            <li><a href="/addProduct.jsp">添加</a></li>
            <li><a href="/ShowAllServlet">显示所有商品</a></li>
        </ul>
    </div>

</body>
</html>
