package com.cdac.service;

import java.util.ArrayList;

import com.cdac.model.SourceDestination;
import com.cdac.model.Toll_Details;
import com.cdac.model.VehicleVerify;

public interface IntfValidateVehicleService 
{
	
	public String validateVehicle(VehicleVerify vehicleVerify);
	public ArrayList<Toll_Details> fetchTolls(SourceDestination sourceDestination,String vehicleType);

}
