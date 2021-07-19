<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021/7/18
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页面</title>
    <script src="js/jquery-3.6.0.min.js"></script>
  </head>
  <body>
      <button>添加学生</button>
      <button>查询学生</button>
  </body>
</html>
<script>
    $("button:first").click(function() {
        location.href="student_insert.jsp";
    })
    $("button:eq(1)").click(function() {
        location.href="studentServlet?mark=queryStudent";
    })
</script>
