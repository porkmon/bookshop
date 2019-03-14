package cn.pork.action.front;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pork.entity.Book;
import cn.pork.entity.OrderLine;
import cn.pork.entity.Orders;
import cn.pork.entity.User;
import cn.pork.service.OrderService;
import cn.pork.util.WebUtil;

@Controller
@RequestMapping("/front/order")
public class OrderAction {
	@Resource
	private OrderService orderService;
	@RequestMapping("/toOrder")
	public String toOrder(HttpSession session,HttpServletRequest request,Orders order) {
		order.setId(WebUtil.uuId());
		User user=(User)session.getAttribute("user");
		order.setUserId(user.getId());
		request.setAttribute("order", order);
		return "forward:/jsp/front/order/order.jsp";
	}
	@RequestMapping("/list")
	public String list(HttpSession session) {
		
		List<Orders> orders=orderService.selectAll();
		session.setAttribute("orders", orders);
		return "forward:/jsp/front/order/list.jsp";
	}
	@RequestMapping("/save")
	public String save(HttpSession session,Orders order) {
		order.setOrderdate(WebUtil.getTime());
		Map<String,Book> bookMap = (Map<String,Book>)session.getAttribute("bookMap");
		if(bookMap==null) {
			session.setAttribute("errorMsg", "购物车为空");
			return "forward:/jsp/error.jsp";
		}else {
			List<OrderLine> orderLineList=new LinkedList<OrderLine>();
			for(Map.Entry<String, Book> entry : bookMap.entrySet()){
				OrderLine orderLine=new OrderLine();
				orderLine.setAmt(entry.getValue().getAmt());
				orderLine.setId(WebUtil.uuId());
				orderLine.setBookId(entry.getValue().getId());
				orderLine.setOrderId(order.getId());
				orderLine.setPrice(entry.getValue().getPrice());
				orderLineList.add(orderLine);
				
	        }
			orderService.insertOne(order,orderLineList);
			
			
			return "forward:/jsp/front/order/ordersucc.jsp";
		}
		
	}
	@RequestMapping("/delete")
	public String delete(HttpSession session,@RequestParam("id")String id) {
		orderService.deleteOne(id);
		List<Orders> orders=orderService.selectAll();
		session.setAttribute("orders", orders);
		return "forward:/jsp/front/order/list.jsp";
		
	}
	@RequestMapping("/detail")
	public String detail(HttpSession session,@RequestParam("id")String id) {
		Orders order=orderService.selectOne(id);
		
		session.setAttribute("order", order);
		return "forward:/jsp/front/order/detail.jsp";
		
	}
}
