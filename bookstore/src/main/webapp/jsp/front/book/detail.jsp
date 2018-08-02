<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  	<script type="text/javascript" src="${pageContext.request.contextPath }/js/show.js"></script>
  	<style type="text/css">
  		table{
  			width:100%;
  			border:0px solid red;
  			font-size:10pt;
  		}
  		td{
  			border-bottom:1px dotted #0000C6;
  		}
  		.img{
  			width:100px;
  			height:120px;
  			border:0px;
  		}
  	</style>
  </head>
  <body style="font-size:10pt;">
  	<p>以下是《${book.name }》的信息</p>
    <table>
    	<tr>
    		<td style="width:120px;">
    			<img class="img" src="${book.img }"></img>
    		</td>
    		<td align="left" valign="top">
    			书名：${book.name }<br/>
    				原价：<font style="text-decoration:line-through;">${book.price }元</font><br/>
    				现价：${book.truePrice}元<br/>
    				折扣：${book.rebate }折<br/>
    			作者：${book.auth }<br/>
    			出版：${book.publisher }<br/>
    			版次：第${book.versions }版，第${book.printtimes }次印刷<br/>
    			出版时间：${book.publishdate }<br/>
    			开本：${book.size }开，共${book.pages }页<br/>
    			<a href="${pageContext.request.contextPath }/front/buy/car.action?bookId=${book.id}">
    				<img style="border:0px;" src="${pageContext.request.contextPath }/css/imgs/btn_buy.gif"></img>
    			</a>
    		</td>
    	</tr>
    	<tr>
    		<td colspan="2">
    			<p>以下是书的说明信息</p>
    			<p>简介：</p>
    			书籍简介
    			<hr style="border:1px dotted blue;"/>
    			<p>${book.brief }</p>
    			${book.content }
    		</td>
    	</tr>
    </table>
  </body>
</html>
