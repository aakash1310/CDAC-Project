package com.cdac.model;

import javax.persistence.Entity;

import org.hibernate.annotations.Table;
import org.springframework.stereotype.Controller;


public class VehicleVerify 
{
	
	
	private String vehicle_regNo;
	private String vehicle_type;
	
	
	public String getVehicle_regNo() {
		return vehicle_regNo;
	}
	public void setVehicle_regNo(String vehicle_regNo) {
		this.vehicle_regNo = vehicle_regNo;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	@Override
	public String toString() {
		return "VehicleVerify [vehicle_regNo=" + vehicle_regNo + ", vehicle_type=" + vehicle_type + "]";
	}
	
	

}
