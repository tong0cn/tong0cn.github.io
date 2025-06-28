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
<a href="/myweb/selejskc">单击显示课程信息</a>
<form action="/myweb/">
	<table>
	<tr>
		<th>课程代码</th>
		<th>课程名称</th>
		<th>班级</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${jskc }" var="a">
		<tr>
			<td>${a.getKcdm()}</td>
			<td>${a.getKcmc()}</td>
			<td>${a.getBj()}</td>
			<td><a href=/myweb/selecjb?bm="${a.getBiaoming()}">录入</a></td>
		</tr>
	</c:forEach>
	
	
	</table>

</form>
<br>


</body>
</html>