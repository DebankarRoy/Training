package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.domain.User;

@Primary
@Repository
@Transactional
public class UserDAOImpl implements UserDAO{

	@Autowired
	EntityManager em;
	
	@Override
	public User saveUser(User toBeCreated) {
		em.persist(toBeCreated);
		return toBeCreated;
	}

	@Override
	public List<User> showAll() {
		Query q = em.createQuery("select p from User as p");
		return q.getResultList();
	}

}
