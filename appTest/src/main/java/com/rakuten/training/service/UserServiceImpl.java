package com.rakuten.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.training.dal.UserDAO;
import com.rakuten.training.domain.User;

@Service
public class UserServiceImpl implements UserService{

	UserDAO dao;
	@Autowired
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public int createUser(User toBeCreated) {
		User created=dao.saveUser(toBeCreated);
		return created.getId();
	}

	@Override
	public List<User> showAll() {
		return dao.showAll();
	}

}
