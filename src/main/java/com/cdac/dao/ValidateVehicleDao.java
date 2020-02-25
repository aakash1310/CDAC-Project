package com.cdac.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.model.SourceDestination;
import com.cdac.model.Toll_Details;
import com.cdac.model.VehicleVerify;
@Repository
public class ValidateVehicleDao 
{
	private static final int Toll_Details = 0;
	private static final int ArrayList = 0;
	@Autowired
	JdbcTemplate jdbcTemplate;

	public String validate(VehicleVerify vehicle) 
	{
		System.out.println("Inside dapo"+vehicle.getVehicle_type()+vehicle.getVehicle_regNo());
		String sql="Select * from rto_table where regNo=? and vehicle_type=?";
		
		
		try
		{
		VehicleVerify vehicleVerify=jdbcTemplate.queryForObject(sql,new Object[] {vehicle.getVehicle_regNo(),vehicle.getVehicle_type()},new VehicleRowMapper());
		
			return "Vehicle type matched";
		
		}
		catch(Exception e)
		{
			return "Vehicle type not matched with registeration no.";
		}
		
	}
	
	public java.util.ArrayList<com.cdac.model.Toll_Details> get(SourceDestination sourceDestination,String vehicleType)
	{
		
		String sql1="Select toll_name,"+vehicleType+" from toll_table where toll_id in(select toll_id from route_table where source=? and destination=?)";
		
		ArrayList<Toll_Details> tollList=new ArrayList<Toll_Details>();
		//tollList=jdbcTemplate.queryForObject(sql1,new Object[] {sourceDestination.getSource(),sourceDestination.getDestination()},new TollRowMapper());
		tollList=(java.util.ArrayList<com.cdac.model.Toll_Details>) jdbcTemplate.query(sql1, new Object[] {sourceDestination.getSource(),sourceDestination.getDestination()},new TollRowMapper(vehicleType));
		
		return tollList;
		
	}
}
