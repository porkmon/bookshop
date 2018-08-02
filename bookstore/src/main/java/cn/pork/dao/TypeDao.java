package cn.pork.dao;

import java.util.List;

import cn.pork.entity.Type;

public interface TypeDao {
	public int insertOne(Type type);
	public Type selectOne(String id);
	public List selectAll();
}
