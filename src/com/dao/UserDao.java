package com.dao;

import java.util.List;

import com.po.User;

public interface UserDao {

	public int register(User user);

	public List<User> login(User user);

	public User selectUserById(Integer id);

}
