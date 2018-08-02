package cn.pork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pork.dao.UserDao;
import cn.pork.entity.User;
import cn.pork.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	public int insertOne(User user) {
		return userDao.insertOne(user);
	}

	public User selectOne(String id) {
		return userDao.selectOne(id);
	}

	public User selectByName(String name) {
		return userDao.selectByName(name);
	}

}
