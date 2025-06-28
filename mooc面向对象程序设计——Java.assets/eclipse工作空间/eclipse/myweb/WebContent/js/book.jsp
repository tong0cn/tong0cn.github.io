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

<form action="/myweb/cjlr?kcdm=${a.getKcdm()}">
	<table>
	<tr>
		<th>课程代码</th>
		<th>课程名称</th>
		<th>班级</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${xscj }" var="a">
		<tr>
			<td>${a.getKcdm()}</td>
			<td>${a.getKcmc()}</td>
			<td><input type="text" name="xh" value=${a.getBj()} disabled="disabled"></td>
			<td><input type="text" name="cj"></td>
		</tr>
	</c:forEach>
	
	
	</table>
	<input type="submit" value="录入">
</form>
<br>
