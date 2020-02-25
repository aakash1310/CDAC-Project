package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cdac.dao.UserDao;
import com.cdac.model.Login;
import com.cdac.model.User;


@Service
public class Services implements IntfService
{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public String registerService(User user)
	{
		String ret=null;
		try {
				ret = userDao.insert(user);
				return ret;
			} 
		catch (Exception e) 
		{
			ret="User id already exists";
			return ret;
		}
	}
	
	@Override
	public String loginService(Login login)
	{
		
		
		long ret=0;
		try {
		ret=userDao.check(login);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(ret);
			
			if(ret==1)
			{
				return "Successful";
			}
			else
			{
				return"Invalid Credentials";
			
			} 
		
	}
	

}
