<%--注册--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    request.setAttribute("path", path);
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>registered</title>

</head>
<body>
<form action="${path}/index.html" method="post" >

    <input type="text" name="uName" />
    <input type="text" name="uPwd" />
    <input type="submit" value="提交" />
</form>

</body>
</html>
