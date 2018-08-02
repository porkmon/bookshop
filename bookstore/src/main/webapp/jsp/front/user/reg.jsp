<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/Pub.css"></link>
  	<script type="text/javascript" src="${pageContext.request.contextPath }/js/user.js"></script>
  	<script type="text/javascript">
  		var path = "<c:url value='/'/>";
  	</script>
  	<style type="text/css">
  		table{
  			font-size:10pt;
  			width:330px;
  		}
  		.txt{
  			border:0px;
  			border-bottom:1px solid blue;
  			width:200px;
  		}
  		td{
  			padding:5px;
  		}
  	</style>
  </head>
  <body style="text-align:center;">
  		<br/><br/><br/><br/>
  		<form name="f1" method="post"  action="${pageContext.request.contextPath}/front/user/reg.action" onsubmit="return valdate()">
  		<table>
			  <tr style="background:#7D7DFF;">
			  	<td colspan="2" align="center">
			  		用户注册
			  	</td>
			  </tr>
			  <tr>
			  	<td>
			  		姓名<font color="red">*</font>：
			  	</td>
			  	<td>
			  		<input class="txt" type="text" name="name"/>
			  	</td>
			  </tr>	
			   <tr>
			  	<td>
			  		密码<font color="red">*</font>：
			  	</td>
			  	<td>
			  		<input class="txt" type="password" name="password"/>
			  	</td>
			  </tr>	
			   <tr>
			  	<td>
			  		再次输入密码<font color="red">*</font>：
			  	</td>
			  	<td>
			  		<input class="txt" type="password" name="password2"/>
			  	</td>
			  </tr>	
			   <tr>
			  	<td>
			  		电话：
			  	</td>
			  	<td>
			  		<input class="txt" type="text" name="phone"/>
			  	</td>
			  </tr>	
			   <tr>
			  	<td>
			  		Email：
			  	</td>
			  	<td>
			  		<input class="txt" type="text" name="email"/>
			  	</td>
			  </tr>	
			  <tr>
			  	<td>
			  		验证码：
			  	</td>
			  	<td>
			  		<input class="txt" type="text" style="width:100px;" name="sCode"/>
			  		<img id="Code" src="${pageContext.request.contextPath }/image.action" title="看不清？点击一下" onclick="changImage()"></img>
			  	</td>
			  </tr>
			  <tr>
			  	<td id="msg" colspan="2" style="color:red;" align="center">
			  	</td>
			  </tr>
			  <tr>
			  	<td colspan="2" align="center">	
			  		<input type="submit" class="OperBtn" value="注册" style="margin:5px;"/>
			  		<button class="OperBtn" style="margin:5px;">取消</button>
			  	</td>
			  </tr>	
  		</table>
  		</form>
  		<script type="text/javascript">
  			function changImage() {
				var code=document.getElementById("Code");
				code.src="${pageContext.request.contextPath}/image.action?ran="+Math.random(10000);
			}
  		</script>
  </body>
  
  
</html>
  		