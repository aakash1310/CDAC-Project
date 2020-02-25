package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.model.Login;
import com.cdac.model.User;

@Repository
public class UserDao 
{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	public String insert(User user) throws Exception
	{
		
		entityManager.persist(user);
		return "Registered Successfully";
	
	}
	
	@Transactional
	public long check(Login login) 
	{
	
		return  (long)entityManager
	     .createQuery("select count(c) from User c where c.user_loginId = :em and c.user_password = :pwd")
		.setParameter("em",login.getLoginId())
		.setParameter("pwd", login.getPassword())
		.getSingleResult();
		
	
	}
	

}
