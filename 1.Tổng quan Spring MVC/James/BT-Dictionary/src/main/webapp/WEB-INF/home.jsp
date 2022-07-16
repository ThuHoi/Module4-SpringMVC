<%--
  Created by IntelliJ IDEA.
  User: Thu Hoi
  Date: 2022/07/14
  Time: 5:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/translate" method="post">
  <table>
      <tr><td><input placeholder="English" name="ta"></td></tr>
      <tr><td><input type="submit" value="Translate"></td></tr>
  </table>
</form>

</body>
</html>
