package cn.pork.action.front;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pork.entity.Book;
import cn.pork.entity.User;
import cn.pork.service.BookService;

@Controller
@RequestMapping(value="/front/buy")
public class BuyAction {
	@Resource
	private BookService bookService;
	
	@RequestMapping(value="/car")
	public String car(HttpSession session,String bookId) {
		//String bookId=(String)map.get("bookId");
		//System.out.println(bookId);
		Book book;
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			
			Map<String,Book> bookMap=(Map<String,Book>) session.getAttribute("bookMap");
			if(bookMap==null&&bookId!="null") {
				bookMap=new HashMap<String,Book>();
				book=bookService.selectOne(bookId);
				book.setAmt(1);
				bookMap.put(book.getId(),book);
				session.setAttribute("bookMap", bookMap);
				return "forward:/jsp/front/buy/car.jsp";
			}else{
				if(bookMap.containsKey(bookId)) {
					book=bookMap.get(bookId);
					book.setAmt(book.getAmt()+1);
					bookMap.put(book.getId(), book);
					session.setAttribute("bookMap", bookMap);
					return "forward:/jsp/front/buy/car.jsp";
				}else {
					book=bookService.selectOne(bookId);
					book.setAmt(1);
					bookMap.put(book.getId(),book);
					
					session.setAttribute("bookMap", bookMap);
					return "forward:/jsp/front/buy/car.jsp";
				}
			}
		}else{
			return "forward:/jsp/front/user/login.jsp";
		}
		/*Book book=bookService.selectOne(bookId);
		map.addAttribute("book", book);
		
		return "forward:/jsp/front/buy/car.jsp";*/
	}
	@RequestMapping("/add")
	public String add(HttpSession session,@RequestParam("id")String id) {
		Map <String,Book>bookMap=(Map<String, Book>) session.getAttribute("bookMap");
		bookMap.get(id).setAmt(bookMap.get(id).getAmt()+1);
		session.setAttribute("bookMap", bookMap);
		return "forward:/jsp/front/buy/car.jsp";
	}
	@RequestMapping("/del")
	public String del(HttpSession session,@RequestParam("id")String id) {
		Map <String,Book>bookMap=(Map<String, Book>) session.getAttribute("bookMap");
		if(bookMap.get(id).getAmt()<=1) {
			bookMap.remove(id);
		}else {
			bookMap.get(id).setAmt(bookMap.get(id).getAmt()-1);
		}
		
		session.setAttribute("bookMap", bookMap);
		return "forward:/jsp/front/buy/car.jsp";
	}
}
