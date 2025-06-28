<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<a href="/myweb/seleallstu">单击显示学生信息</a>
<form action="/myweb/delestusele">
	<table>
	<tr>
		<th></th>
		<th>学号</th>
		<th>姓名</th>
		<th>性别</th>
		<th>院系</th>
		<th>班级</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${stulist }" var="a">
		<tr>
			<th><input type="checkbox" value=${a.getNum()} name="id"></th>
			<th>${a.getNum() }</th>
			<th>${a.getName()}</th>
			<th>${a.getGender()}</th>
			<th>${a.getYx()}</th>
			<th>${a.getBj()}</th>
			<th><a href="/myweb/seleone?name=${a.getNum() }">修改</a><a href="/myweb/delestuone?id=${a.getNum()}">删除</a></th>
		</tr>
	</c:forEach>
	
	
	</table>
	<input type="submit" value="删除选中">
</form>
<br>
<form action="/myweb/updatestu">
	<table>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>院系</th>
			<th>班级</th>
			
		</tr>
		<tr>
			<td><input type="text" value=${stu.getNum() } name="x1"></td>
			<td><input type="text" value=${stu.getName() } name="x2"></td>
			<td><input type="text" value=${stu.getGender() } name="x3"></td>
			<td><input type="text" value=${stu.getYx() } name="x4"></td>
			<td><input type="text" value=${stu.getBj() } name="x5"></td>
		</tr>	
	</table>
	<input  type="submit" value="提交修改">
</form>

</body>
</html>