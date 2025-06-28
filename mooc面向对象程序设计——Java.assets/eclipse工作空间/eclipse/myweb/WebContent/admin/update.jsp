<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="/myweb/seleone">个人信息查询</a>
<table>
	<tr><th>学号</th><th>姓名</th><th>性别</th><th>院系</th><th>班级</th><th>操作</th></tr>
	<tr>
		<th>${stu.num }</th>
		<th><input  type="text" value=${stu.name } name="name"></th>
		<th>${stu.gender }</th>
		<th>${stu.yx }</th>
		<th>${stu.bj }</th>
		<th><a href="?num=$(stu.num)">修改</a></th>
	
	</tr>
</table>
</body>
</html>