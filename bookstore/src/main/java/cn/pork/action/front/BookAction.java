package cn.pork.action.front;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pork.entity.Book;
import cn.pork.service.BookService;

@Controller
@RequestMapping(value="/front/book")
public class BookAction {
	@Resource
	private BookService bookService;
	@RequestMapping(value="/list")
	public String selectBook(HttpServletRequest request,@RequestParam(value="typeId",required=false)String typeId) {
		/*String typeId=(String)request.getAttribute("typeId");*/
		List<Book> bookList;
		if(typeId==null||typeId.equals("")) {
			bookList=bookService.selectAll();
		}else {
			bookList=bookService.selectList(typeId);
		}
		request.setAttribute("bookList", bookList);
		return "forward:/jsp/front/book/list.jsp";
		
	}
	
	@RequestMapping(value="detail")
	public String detail(ModelMap map,String bookId) {
		Book book=bookService.selectOne(bookId);
		map.addAttribute("book",book);
		return "forward:/jsp/front/book/detail.jsp";
		
	}
}
