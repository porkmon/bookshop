package cn.pork.service;

import java.util.List;

import cn.pork.entity.Book;

public interface BookService {
	public int insertOne(Book book)throws Exception;
	public Book selectOne(String id);
	public List<Book> selectAll();
	public List<Book> selectList(String typeId);
}
