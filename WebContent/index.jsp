<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world! web访问的页面是index.jsp</h1>
	<br>
	<a id="listPersion" href="/listPersion">listPersion</a>
</body>
<script type="text/javascript">
var url="/ssm"
var listPersion=document.getElementById("listPersion");
listPersion.href=url+"/"+"listPersion"
</script>
</html>