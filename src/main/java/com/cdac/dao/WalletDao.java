package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.model.WalletAccount;

@Repository
public class WalletDao 
{

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public WalletAccount fetch(String loginId,int amt) 
	{
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-demo");
		
		//EntityManager em = emf.createEntityManager();
		
		//Object obj = em.find(loginId, amt);
		 WalletAccount val=(WalletAccount) em.createQuery("SELECT c FROM WalletAccount c where c.loginId=:li").setParameter("li", loginId).getSingleResult();
		 
		 System.out.println(val.getAmount()+"==========================================+++++++++++++++++++++++++++++++++++++=");
		 System.out.println(val.getLoginId()+"inside fetchhhhhhhhhhhhhhhh");
		
		em.close();
		//emf.close();
		
		return val;
	}
	
	
	@Transactional
	public int upsertMoney(WalletAccount obj)
	{
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-demo");
		//EntityManager em = emf.createEntityManager();
		//EntityTransaction tx = em.getTransaction();
		
		//tx.begin();
		//System.out.println(obj.getAmount()+"gggggggggggggggggggggggggggggggggggggggg");
		//System.out.println(obj.getLoginId()+"llllllllllllllllllllllllllllllllllllllllllllllllllllllll");
	
		Query query = em.createQuery("UPDATE WalletAccount s SET s.amount =:amt WHERE s.loginId =:p").setParameter("amt",obj.getAmount()).setParameter("p", obj.getLoginId());
		int a=query.executeUpdate();
		System.out.println(a+"kjsdfjfvgkjfngvkgvjnfkjgn");
		
		//em.merge(obj); 
		//tx.commit();
	
		em.close();
		return obj.getAmount();
		//emf.close();
	}


	
}
