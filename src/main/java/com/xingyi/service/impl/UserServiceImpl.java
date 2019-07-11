package com.xingyi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xingyi.dao.UserDao;
import com.xingyi.entity.User;
import com.xingyi.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;

	@Override
	public List<User> searchAll() {
		return userDao.selectAll();
	}
	
}
