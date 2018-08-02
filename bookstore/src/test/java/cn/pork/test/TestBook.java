package cn.pork.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pork.dao.BookDao;
import cn.pork.entity.Book;
import cn.pork.service.BookService;
import cn.pork.service.impl.BookServiceImpl;

public class TestBook {
/*
	static private BookDaoImpl bookDao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		bookDao=(BookDaoImpl) context.getBean("bookDao");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testSelectDept() {
		System.out.println(bookDao.selectBook("002"));
	}

	@Test
	public void testInsertBook(){
		Book book=new Book();
		
		book.setId("003");
		book.setName("name117");
		
		book.setPrice(12.21);
		book.setImg("22");
		book.setRebate(0.22);
		book.setStock(11);
		bookDao.insertBook(book);
	}
	
	
	@Test
	public void selectBook() {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bookService=(BookServiceImpl) context.getBean("bookServiceImpl");
		Book book=bookService.selectBook("001");
		System.out.println(book);
	
	}
	*/
}



