package cn.pork.action.front;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pork.entity.Book;
import cn.pork.service.BookService;

@Controller
@RequestMapping(value="/front/buy")
public class BuyAction {
	@Resource
	private BookService bookService;
	
	@RequestMapping(value="/car")
	public String car(HttpServletRequest request) {
		String bookId=(String)request.getAttribute("bookId");
		Book book=bookService.selectOne(bookId);
		request.setAttribute("book", book);
		return "forward:/jsp/front/buy/car.jsp";
	}
}
