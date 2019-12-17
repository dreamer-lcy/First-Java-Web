<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加数据</title>
</head>
<style type="text/css">
    .hel {
        width: 100px;
        height: 40px;
        margin-top: 5px;
        margin-left: 52px;
    }
    .input {
        width: 250px;
        height: 20px;
    }

</style>
<body style="background-image:url(images/manager-bg.jpg);background-repeat: no-repeat;background-size: cover;font-size:40px;font-family:'KaiTi';text-align:center">">
    <h2>商品的添加</h2>
    <form action="AddProductServlet" method="post">
        商品名称：<input name="name" class="input" ><br>
        商品价格：<input name="price"class="input"><br>
        商品数量：<input name="number"class="input"><br>
        商品描述: <input name="description"class="input"><br>
        <input type="submit" value="添加" class="hel">
    </form>
</body>
</html>
