<%
    String basePath=request.getScheme() +"://" +
            request.getServerName()+":"+request.getServerPort()+
            request.getContextPath()+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>功能入口</title>
    <base href="<%=basePath%>" />
</head>
<body>
<div align="center">
<p>ssm整合例子</p>
    <img src="images/a.jpg" alt="" />
    <table>
        <tr>
            <td><a href="addStudent.jsp">注册学生</a></td>
        </tr>
        <tr>
            <td><a href="listStudent.jsp">浏览学生</a></td>
        </tr>
    </table>

</div>
<p>当出来的方法是ModelAndView时实现forward转发</p>
<form action="doForward.do" method="post">
    姓名: <input type="text" name="name">
    年龄: <input type="text" name="age">
    <input type="submit" value="提交请求">
</form>
<p>处理全局异常</p>
<form action="some.do" method="post">
    姓名: <input type="text" name="tname">
    年龄: <input type="text" name="tage">
    <input type="submit" value="提交请求">
</form>

<p>一个拦截器</p>
<form action="user/some.do" method="post">
    姓名: <input type="text" name="tname">
    年龄: <input type="text" name="tage">
    <input type="submit" value="提交请求">
</form>
</body>
</html>
