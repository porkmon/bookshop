package cn.pork.dao;

import cn.pork.entity.User;

public interface UserDao {
	public int insertOne(User user);
	public User selectOne(String id);
	public User selectByName(String name);
}
