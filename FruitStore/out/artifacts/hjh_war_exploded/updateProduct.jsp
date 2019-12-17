<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新数据库</title>
</head>
<style type="text/css">
    .hell {
        width: 100px;
        height: 40px;
        margin-top: 5px;
        margin-left: 52px;
    }
    .input1 {
        width: 250px;
        height: 40px;
    }

</style>
<body style="background-image:url(images/update.jpg);background-repeat: no-repeat;background-size: cover;font-size:40px;font-family:'KaiTi';text-align:center">
    <h2>更新数据库</h2>
    <form action="UpdateProductServlet" method="post">
        <input name="id" value="${product.id}" hidden class="input1"><br>
        商品名称：<input name="name" value="${product.name}"class="input1" ><br>
        起始价格：<input name="price" value="${product.id}" disabled class="input1"><br>
        商品数量：<input name="number" value="${product.number}" class="input1" ><br>
        商品描述：<input name="description" value="${product.description}" class="input1" ><br>
        创建时间：<input name="createDate" value="${product.createDate}"  class="input1"><br>
        更新时间：<input name="updateDate" value="${product.updateDate}" disabled class="input1"><br>
        <input type="submit" value="提交" class="hell">
    </form>

</body>
</html>
