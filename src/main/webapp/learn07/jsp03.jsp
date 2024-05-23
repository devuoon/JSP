
<%@ page contentType="text/html;charset=utf-8" %>
<%
    int result = 0;
    if (request.getMethod().equals("POST")) {
    String op = request.getParameter("operator");
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
        result = switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> result;
        };
    }
%>
<HTML>
<HEAD>
    <TITLE> 계산기 </TITLE>
</HEAD>
<BODY>
    <H3> 계산기 </H3>
    <form name=form1 method=post>
        <label>
            <INPUT TYPE="text" NAME="num1" width=200 size="5">
        </label>
        <label>
            <SELECT NAME="operator">
                <option>+</option>
                <option>-</option>
                <option>*</option>
                <option>/</option>
            </SELECT>
        </label>
        <label>
            <INPUT TYPE="text" NAME="num2" width=200 size="5">
        </label>
        <input type="submit" value="계산" name="B1">
    </form>
        계산 결과 : <%=result %>
</BODY>
</HTML>