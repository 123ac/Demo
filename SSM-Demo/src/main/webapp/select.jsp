<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>教师信息</title>
<style type="text/css">
tr{width: 160px}
td{width: 70px;height: 30px;}
a{ text-decoration:none} 
</style>
 
</head>
<body>
 
<div>
<table   style="margin: auto；">
<tr>
	 	<td>id</td>
	 	<td>学院id</td>
		<td>教师编号</td>
		<td>姓名</td>
		<td>密码</td>
		
	</tr>
<c:forEach items="${list}" var="sc">
	<tr class="${sc.id}">
		<td><c:out value="${sc.id}"></c:out></td>
		<td><c:out value="${sc.collegeId}"></c:out></td>
		<td><c:out value="${sc.teacherId}"></c:out></td>
		<td><c:out value="${sc.teacherName}"></c:out></td>
		<td><c:out value="${sc.teacherPwd}"></c:out></td>
	</tr>
</c:forEach>
</table>
</div>


</body>
</html>