package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.cdac.model.VehicleVerify;


public class VehicleRowMapper implements RowMapper<VehicleVerify> 
	{
	
		@Override
		public VehicleVerify mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("iNSIDE MAPPER");
			
			VehicleVerify vehicle=new VehicleVerify();
			
			//vehicle.setId(rs.getInt("id"));
			vehicle.setVehicle_regNo(rs.getString("regNo"));
			vehicle.setVehicle_type(rs.getString("vehicle_type"));
			return vehicle;
		}

	}



