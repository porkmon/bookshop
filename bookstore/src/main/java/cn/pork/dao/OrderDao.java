package cn.pork.dao;



import java.util.List;

import cn.pork.entity.Orders;


public interface OrderDao {
	public int insertOne(Orders order);
	public List<Orders> selectAll();
	public int deleteOne(String id);
	public Orders selectOne(String id);
	/*
	public List<Book> selectList(String typeId);*/
}
