<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021/7/18
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #box {
            width: fit-content;
            margin: 50px auto;
        }

    </style>
</head>
<body>
<div id="box">
    <form action="studentServlet?mark=insertStudent" method="post" enctype="multipart/form-data">
        姓名:<input type="text" name="sname"> <br><br>
        性别:<input type="radio" name="sex" value="1"> 男
        <input type="radio" name="sex" value="0"> 女 <br><br>
        生日:<input type="date" name="sbir"> <br><br>
        爱好:<input type="checkbox" name="hobby" value="抽烟"> 抽烟
        <input type="checkbox" name="hobby" value="喝酒"> 喝酒
        <input type="checkbox" name="hobby" value="烫头"> 烫头
        <input type="checkbox" name="hobby" value="rap"> rap <br><br>
        头像:<input type="file" name="photo" value=""> <br><br>
        <input type="submit" value="点我添加学生信息"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
