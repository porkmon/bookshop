package cn.pork.dao;

import java.util.List;

import cn.pork.entity.Address;
import cn.pork.entity.Book;

public interface AddressDao {
	public List<Address> selectList(String userId);
	public int insertOne(Address address);
	public int chgDftTo0();
	public int chgDftTo1(String id);
	public int deleteOne(String id);
}
