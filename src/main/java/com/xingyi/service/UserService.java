package com.xingyi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xingyi.entity.User;


public interface UserService {

	public List<User> searchAll();
}
