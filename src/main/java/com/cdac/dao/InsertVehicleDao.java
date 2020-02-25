package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.model.UsersVehicle;
import com.cdac.model.VehicleVerify;


@Repository
public class InsertVehicleDao 
{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	public String addVehicle(UsersVehicle usersVehicle) throws Exception
	{
		
		entityManager.persist(usersVehicle);
		return "Vehicle Inserted";
	
	}
}
