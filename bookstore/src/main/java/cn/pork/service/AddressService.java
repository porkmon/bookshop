package cn.pork.service;

import java.util.List;

import cn.pork.entity.Address;

public interface AddressService {
	public List<Address> selectList(String userId);
	public int insertOne(Address address);
	public int updateDft(String id);
	public int deleteOne(String id);
}
