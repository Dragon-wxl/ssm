<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world! web访问的路径是listPersion</h1>
	<table align='center' border='1' cellspacing='0'>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>birthday</td>
			<td>sex</td>
			<td>department</td>
		</tr>
		<c:forEach items="${list}" var="persion" varStatus="st">
			<tr>
				<td>${persion.id}</td>
				<td>${persion.name}</td>
				<td>${persion.birthday}</td>
				<td>${persion.sex}</td>
				<td>${persion.department}</td>

			</tr>
		</c:forEach>
		<br>
		<tr>
			<%-- <td colspan="5"><a href="?start=${persion.firstPage}">[首 页]</a> <a
				href="?start=${pageInfo.prePage}">[上一页]</a> <a
				href="?start=${pageInfo.nextPage}">[下一页]</a> <a
				href="?start=${pageInfo.lastPage}">[末 页]</a></td> --%>
			<td colspan="5"><a href="?start=0">[首 页]</a>
				<a href="?start=${page.start-page.count<=0?0:page.start-page.count}">[上一页]</a> <a
				href="?start=${page.start+page.count>=page.last?page.last:page.start+page.count}">[下一页]</a> <a
				href="?start=${page.last}">[末 页]</a></td>


		</tr>
	</table>

</body>
</html>