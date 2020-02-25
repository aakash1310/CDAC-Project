package com.cdac.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//Do with JDBC 
@Entity
@Table(name = "Users_Vehicle")
public class UsersVehicle {

	
	@Id
	private String uv_regNo;
	private String uv_type;

	@ManyToOne
	@JoinColumn(name = "user_loginId")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//private String user_LoginId;
	public String getUv_regNo() {
		return uv_regNo;
	}

	public void setUv_regNo(String uv_regNo) {
		this.uv_regNo = uv_regNo;
	}

	public String getUv_type() {
		return uv_type;
	}

	public void setUv_type(String uv_type) {
		this.uv_type = uv_type;
	}



}
