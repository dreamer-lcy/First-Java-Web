<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新数据库</title>
</head>
<body style="background-image:url(images/update.jpg);background-repeat: no-repeat;background-size: cover">
    <h2>更新数据库</h2>
    <form action="UpdateProductServlet" method="post">
        <input name="id" value="${product.id}" hidden ><br>
        商品名称：<input name="name" value="${product.name}" ><br>
        起始价格：<input name="price" value="${product.id}" disabled><br>
        更新价格：<input name="currentPrice" value="${product.price}" ><br>
        商品描述：<input name="description" value="${product.description}" ><br>
        创建时间：<input name="createDate" value="${product.createDate}" disabled><br>
        更新时间：<input name="updateDate" value="${product.updateDate}" disabled><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
