package com.niit.dao;

import com.niit.model.User;

public interface UserDao {
	public void saveUser(User user);

	public User getUserByUsername(String username);
	public User getUserByUserId(int userId);
}
