<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  	<link rel="stylesheet" type="text/css" href="<c:url value='/css/Pub.css'/>"></link>
  	<script type="text/javascript">
  		var path = "${pageContext.request.contextPath}";
  	</script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/car.js"></script>
  	<style type="text/css">
  		*{
  			font-size:10pt;
  		}
  		table{
  			border:1px solid gray;
  			border-collapse: collapse;
  			width:80%;
  		}
  		td{
  			border:1px solid gray;
  			padding:5px;
  		}
  		.head{
  			background:#9393FF;
  		}
  		.head td{
  			text-align:center;
  			font:bold;
  			padding:5px;
  		}
  		.even{
  			background:#DDDDFF;
  		}
  		td button{
  			margin-left:7px;
  		}
  		.oper{
  			cursor:pointer;
  			border:0px;
  			background:transparent;
  		}
  	</style>
  </head>
  <body>
  <script>

	function _add(id){//所有的操作都必须要先操作Session然后才操作页面数据
		
		var url = path+"/front/buy/add.action?id="+id;
		
		window.location.href=url;
	}
	/**
	 * 删除一本书
	 */
	function _del(id){
		var url = path+"/front/buy/del.action?id="+id;
		
		
		window.location.href=url;
		
	}
	
	/**
	 * 提交生成订单
	 */
	function sure(){
		var tb = document.getElementById("table");
		if(tb.rows.length<=3){
			return;
		}
		window.location.href=path+"/front/address/list.action";
	}
</script>

  		<p>以下是你买的所有图书-><font color="red" style="font:bold;">订单明细</font>-->选择/添加收货地址->确认订单->网银付款或到货付款->查收货物</p>
  		<table id="table">
  			<tr class="head">
  				<td>
  					书名
  				</td>
  				<td>
  					价格
  				</td>
  				<td>
  					数量
  				</td>
  				<td>
  					合计
  				</td>
  				<td>
  					增/删
  				</td>
  			</tr>
  			<c:forEach items="${bookMap}" var="book">
  				<tr>
  					
	  				<td>
	  					<a href="${pageContext.request.contextPath }/index?action=queryBook&id=${book.value.id}">
	  						${book.value.name}
	  					</a>
	  				</td>
	  				<td>
	  					<fmt:formatNumber value="${book.value.price*book.value.rebate}" pattern="##.##" minFractionDigits="2" />
	  				</td>
	  				<td>
	  					${book.value.amt}
	  				</td>
	  				<td>
	  					<fmt:formatNumber value="${book.value.price*book.value.rebate*book.value.amt}" pattern="##.##" minFractionDigits="2" />
	  					<c:set var="total" value="${total+book.value.price*book.value.rebate*book.value.amt}"></c:set>
	  				</td>
	  				<td width="50">
	  					<input class="oper" type="button"  onclick="_add('${book.value.id}')" value="+"/>
	  					&nbsp;
	  					<input class="oper" type="button"  onclick="_del('${book.value.id}')" value="-"/>
	  				</td>
	  				
  				</tr>
  			</c:forEach>
  			<tr class="head">
  				<td colspan="5" style="text-align:right;">
  					总金额：
  					<label id="sum">
  					<fmt:formatNumber pattern="#.##" value="${total}"></fmt:formatNumber>
  					</label>
  					元
  				</td>
  			</tr>
  			<tr style="background:#E0E0E0;">
  				<td colspan="5" style="text-align:right;">
  					<button class="OperBtn" onclick="sure();" style="width:220px;">下一步->选择收货地址</button>
  					<button class="OperBtn" onclick="alert('请同学们完成\n清空session中的car数据');" style="width:120px;">全部取消</button>
  				</td>
  			</tr>
  		</table>
  </body>
</html>
