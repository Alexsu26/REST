<%--
  Created by IntelliJ IDEA.
  User: liyang
  Date: 2024/6/10
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form id="form" method="post" action="./formatter">
        <table>
            <tr>
                <td>日期</td>
                <td><input id="date" name="date" type="text"
                value="2020-03-01" /> </td>
            </tr>
            <tr>
                <td>金额</td>
                <td><input id="amount" name="amount" type="text"
                           value="123,000.00" /> </td>
            </tr>
            <tr>
                <td></td>
                <td align="right">
                    <input id="commit" type="submit" value="提交" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
