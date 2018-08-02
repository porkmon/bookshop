package cn.pork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pork.dao.BookDao;
import cn.pork.entity.Book;
import cn.pork.service.BookService;
@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;
	public int insertOne(Book book) throws Exception {
		return bookDao.insertOne(book);
	}

	public Book selectOne(String id) {
		return bookDao.selectOne(id);
	}

	public List<Book> selectAll() {
		return bookDao.selectAll();
	}
	public List<Book> selectList(String typeId){
		return bookDao.selectList(typeId);
	}
}
