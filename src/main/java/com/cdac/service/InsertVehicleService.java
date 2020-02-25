package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.InsertVehicleDao;
import com.cdac.model.UsersVehicle;
import com.cdac.model.VehicleVerify;

@Service
public class InsertVehicleService implements Intf_InsertVehicleService
{
	@Autowired
	InsertVehicleDao insertVehicleDao;

	@Override
	public String insertVehicle(UsersVehicle usersVehicle) 
	{
		String ret=null;
		try {
				ret = insertVehicleDao.addVehicle(usersVehicle);
				return ret;
			} 
		catch (Exception e) 
		{
			ret="User Vehicle Already Exists";
			e.printStackTrace();
			return ret;
		}
		
	}
	
	
}
