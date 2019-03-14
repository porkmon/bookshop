package cn.pork.service;



import java.util.List;

import cn.pork.entity.OrderLine;
import cn.pork.entity.Orders;


public interface OrderService {
	public int insertOne(Orders order,List<OrderLine> orderLine);
	public List<Orders> selectAll();
	public int deleteOne(String id);
	public Orders selectOne(String id);
	/*
	public List<Book> selectList(String typeId);*/
}
