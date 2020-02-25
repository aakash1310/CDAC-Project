package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.cdac.model.Toll_Details;
import com.cdac.model.VehicleVerify;

public class TollRowMapper implements RowMapper<Toll_Details> 
{
	public String vehicleType;
//@Autowired
//HttpSession session;
	public TollRowMapper(String vehicle)
	{
		this.vehicleType=vehicle;
	}

	@Override
	public Toll_Details mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("iNSIDE MAPPER");
		
		 Toll_Details getToll=new Toll_Details();
		
		VehicleVerify vehicle=new VehicleVerify();
				System.out.println(vehicleType);
		getToll.setToll_name(rs.getString("toll_name"));
		getToll.setPrice(rs.getInt(""+vehicleType));
		return getToll;
	}

}