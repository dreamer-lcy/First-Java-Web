<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加数据</title>
</head>
<body style="background-image:url(images/manager-bg.jpg);background-repeat: no-repeat;background-size: cover">">
    <h2>商品的添加</h2>
    <form action="AddProductServlet" method="post">
        商品名称：<input name="name"><br>
        商品价格：<input name="price"><br>
        当前介格：<input name="current_price"><br>
        商品描述<input name="description"><br>
        <input type="submit" value="添加">

    </form>
</body>
</html>
