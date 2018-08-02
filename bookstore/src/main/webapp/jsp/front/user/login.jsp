<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/Pub.css"></link>
  	<script type="text/javascript" src="${pageContext.request.contextPath }/js/login.js"></script>
  	<script type="text/javascript">
  		var path = "<c:url value='/'/>";//项目的根/book
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
  		<br/><br/>
  		<form name="f1" method="post" action="${pageContext.request.contextPath}/front/user/login.action" onsubmit="return validate()" target="_parent">
  		<table>
			  <tr style="background:#7D7DFF;">
			  	<td colspan="2" align="center">
			  		用户登录
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
			  		验证码<font color="red">*</font>：
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
			  		<input type="submit" class="OperBtn" value="登录" style="margin:5px;"/>
			  		<button class="OperBtn" style="margin:5px;">取消</button>
			  		<a href="${pageContext.request.contextPath }/jsp/front/user/reg.jsp">现在去注册一个新用户</a>
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
  		
