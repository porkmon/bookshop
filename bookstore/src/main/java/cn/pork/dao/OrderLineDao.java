package cn.pork.dao;

import java.util.List;

import cn.pork.entity.OrderLine;

public interface OrderLineDao {
	public int insertOne(OrderLine orderLine);
	public int deleteList(String orderId);
	public List<OrderLine> selectList(String orderId);
}
