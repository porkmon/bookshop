package cn.pork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

import cn.pork.dao.AddressDao;
import cn.pork.entity.Address;
import cn.pork.service.AddressService;
@Service("addressService")
public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressDao addressdao;
	public List<Address> selectList(String userId) {
		// TODO Auto-generated method stub
		return addressdao.selectList(userId);
		
	}
	public int insertOne(Address address) {
		// TODO Auto-generated method stub
		return addressdao.insertOne(address);
	}
	
	public int updateDft(String id) {
		// TODO Auto-generated method stub
		addressdao.chgDftTo0();
		//dao.chgDftTo1(id);
		//int i =1/0;
		return addressdao.chgDftTo1(id);
	}
	public int deleteOne(String id) {
		// TODO Auto-generated method stub
		return addressdao.deleteOne(id);
	}

}
