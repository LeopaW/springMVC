<%--
  Created by IntelliJ IDEA.
  User: Leopa
  Date: 2019/3/26
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请求路径如何写   永远写/
    /代表什么?
    此时的上下文处于容器当中,servlet容器,tomcat
    /项目名称/URI
--%>
<%--${pageContext.request.contextPath}--%>

        <form action= "${ctx}/web/m2" method="post">
            <input type="submit" value="提交"/>
        </form>
</html>
</body>

