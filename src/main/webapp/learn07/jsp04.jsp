<%--
  Created by IntelliJ IDEA.
  User: PKNU
  Date: 24. 5. 23.
  Time: 오후 2:16
  To change this template use File | Settings | File Templates.
--%>
<%--선언부--%>
<%!
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int min(int n1, int n2){
        return n1-n2;
    }
    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="">
        <input type="text" value="">
        <select name="" id="">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <input type="text" value="">
    </form>
</body>
</html>
