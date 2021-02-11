package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.User;

public interface UserDAO {
	public User saveUser(User toBeCreated);
	public List<User> showAll();
}
