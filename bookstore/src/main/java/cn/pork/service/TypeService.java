package cn.pork.service;

import java.util.List;


import cn.pork.entity.Type;

public interface TypeService {
	public int insertOne(Type type)throws Exception;
	public Type selectOne(String id);
	public List<Type> selectAll();
	
}
