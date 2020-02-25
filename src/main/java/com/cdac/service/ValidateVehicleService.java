package com.cdac.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.ValidateVehicleDao;
import com.cdac.model.SourceDestination;
import com.cdac.model.Toll_Details;
import com.cdac.model.VehicleVerify;

@Service
public class ValidateVehicleService implements IntfValidateVehicleService
{
	@Autowired
	private ValidateVehicleDao validateVehicleDao;
	
	public String validateVehicle(VehicleVerify vehicleVerify)
	{
		System.out.println("Inside controller");
		String ret = null;
		try 
		{
			ret = validateVehicleDao.validate(vehicleVerify);
			
			return ret;
		} catch (Exception e) 
		{
			//return "User id already exists";
			ret="Exception";
			e.printStackTrace();
			return ret;
		}
		
	}
	
	public ArrayList<Toll_Details> fetchTolls(SourceDestination sourceDestination,String vehicleType)
	{
		return validateVehicleDao.get(sourceDestination, vehicleType);
	
	}
	
	

}
