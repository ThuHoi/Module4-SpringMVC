<%--
  Created by IntelliJ IDEA.
  User: Thu Hoi
  Date: 2022/07/15
  Time: 4:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Calculator</h2>
<form action="/calculator" method="post">

    <input type="text" value="${num1}" name="num1" size="100" >
    <input type="text" value="${num2}" name="num2" size="100"><br/>

    <button type="submit" value="+" name="cal">Add(+)</button>
    <button type="submit" value="-" name="cal">Sub(-)</button>
    <button type="submit" value="*" name="cal">Mul(*)</button>
    <button type="submit" value="/" name="cal">Div(/)</button>
    <hr/>
    Result:<label>${result}</label>

</form>

</body>
</html>
