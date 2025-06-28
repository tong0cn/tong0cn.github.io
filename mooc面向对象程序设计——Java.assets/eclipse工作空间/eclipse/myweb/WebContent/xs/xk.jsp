<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="/myweb/selexkinfo">单击显示选课信息</a>
<form>
	<table>
		<tr><th>课程名称</th><th>课程代码</th><th>选课状态</th><th>操作</th></tr>
		<c:forEach items="${xklist }" var="a">
			<tr>
			<td>${a.getKcmc() }</td>
			<td>${a.getKcdm() }</td>
			<td>${a.getZt() }</td>
			<td><a href=""></a></td>
			</tr>
		</c:forEach>
	</table>
</form>
<script  src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	$(document).ready(function(){
		$('table').each(function(){
			$(this).find('tr').each(function(){
				if($(this).children('td').eq(2).text()=='未选'){
					$(this).children('td').children('a').text('选课');
					var na=$(this).children('td').eq(1).text();
					$(this).children('td').children('a').attr('href','/myweb/xsxk?kcdm='+na)
				}
				
				if($(this).children('td').eq(2).text()=='已选'){
					$(this).children('td').children('a').text('退课');
					var na=$(this).children('td').eq(1).text();
					$(this).children('td').children('a').attr('href','/myweb/xstk?kcdm='+na)
				}
			})
		})
	})
</script>
</body>
</html>