package cn.pork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pork.dao.TypeDao;
import cn.pork.entity.Book;
import cn.pork.entity.Type;
import cn.pork.service.TypeService;
@Service("typeService")
public class TypeServiceImpl implements TypeService {
	@Autowired
	private TypeDao typeDao;
	public int insertOne(Type type) throws Exception {
		return typeDao.insertOne(type);
	}

	public Type selectOne(String id) {
		return typeDao.selectOne(id);
	}

	public List<Type> selectAll() {
		return  typeDao.selectAll();
	}

	
	

}
