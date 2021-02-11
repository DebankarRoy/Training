package com.rakuten.training.service;

import java.util.List;
import com.rakuten.training.domain.User;

public interface UserService {

	public int createUser(User toBeCreated);
	public List<User> showAll();
	
}
