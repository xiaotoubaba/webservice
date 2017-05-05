<%--
  Created by IntelliJ IDEA.
  User: Yale
  Date: 2017/5/5
  Time: 下午3:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="${basePath}/sayHello" method="post">

    请输入您的名字：

    <input type="text" name="userName"/>

    <input type="submit" value="确定"/>

</form>
</body>
</html>
