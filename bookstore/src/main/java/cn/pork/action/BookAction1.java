package cn.pork.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pork.entity.Book;
import cn.pork.entity.Type;
import cn.pork.service.BookService;
import cn.pork.service.TypeService;

@Controller
@RequestMapping(value="/book")
public class BookAction1 {
	@Resource
	private BookService bookService;
	@Resource
	private TypeService typeService;
	@RequestMapping(value="/insert")
	public String insert(Book book){
		System.out.println("---action.book:"+book);
		try {
			bookService.insertOne(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "forward:/jsp/main.jsp";
	}
	@RequestMapping(value="/select")
	public String select() {
		
		Type type=typeService.selectOne("001");
		System.out.println(type);
		return "forward:/jsp/main.jsp";
	}
	@RequestMapping(value="/selectAllType")
	public String selectAllType() {
		
		List<Type> typeList=typeService.selectAll();
		System.out.println(typeList);
		return "forward:/jsp/main.jsp";
	}
	@RequestMapping(value="/selectAllBook")
	public String selectAllBook() {
		
		List<Book> bookList=bookService.selectAll();
		System.out.println(bookList);
		return "forward:/jsp/main.jsp";
	}
}


