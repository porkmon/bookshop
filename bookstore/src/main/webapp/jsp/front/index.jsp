<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	<form action="${pageContext.request.contextPath }/book/insert.action" method="post">
		id：<input type="text"	name="id"><br> 
		name：<input type="text" name="name"><br>
		price：<input type="text" name="price"><br>
		img：<input type="text" name="img"><br>
		rebate：<input type="text" name="rebate"><br>
		stock：<input type="text" name="stock"><br>
		
		<input type="submit" value="ok">
	</form>
</body>
</html>