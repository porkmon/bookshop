package cn.pork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pork.dao.OrderDao;
import cn.pork.dao.OrderLineDao;
import cn.pork.entity.OrderLine;
import cn.pork.entity.Orders;
import cn.pork.service.OrderService;
@Service("orderService")

public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private OrderLineDao orderLineDao;
	public int insertOne(Orders order,List<OrderLine> orderLines) {
		// TODO Auto-generated method stub
		orderDao.insertOne(order);
		for(OrderLine orderLine:orderLines) {
			orderLineDao.insertOne(orderLine);
		}
		return 1;
	}
	public List<Orders> selectAll(){
		return orderDao.selectAll();
	}
	public int deleteOne(String id) {
		// TODO Auto-generated method stub
		orderLineDao.deleteList(id);
		return orderDao.deleteOne(id);
	}
	public Orders selectOne(String id) {
		// TODO Auto-generated method stub
		Orders order=orderDao.selectOne(id);
		order.setOrderLines(orderLineDao.selectList(id));
		return order;
	}
}
