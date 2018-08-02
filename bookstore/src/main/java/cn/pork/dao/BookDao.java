package cn.pork.dao;

import java.util.List;

import cn.pork.entity.Book;

public interface BookDao {
	public int insertOne(Book book);
	public Book selectOne(String id);
	public List<Book> selectAll();
	public List<Book> selectList(String typeId);
}
