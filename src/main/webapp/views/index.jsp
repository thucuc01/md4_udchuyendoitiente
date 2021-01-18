<%--
  Created by IntelliJ IDEA.
  User: samsam
  Date: 1/18/21
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/home">

    <input type="text" name="value1">

    <select name="change">
        <option value="1">VND</option>
        <option value="2">USD</option>
    </select>
    <br>
    <h3> Ket qua : ${money2} (${dv})</h3>
    <h2> ${erro}</h2>
    <br>
    <button type="submit">Ket qua</button>
</form>
</body>
</html>
