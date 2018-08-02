package cn.pork.service;

import cn.pork.entity.User;

public interface UserService {
	public int insertOne(User user);
	public User selectOne(String id);
	public User selectByName(String name);
}
