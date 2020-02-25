package com.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
	
	@GeneratedValue
	private long user_regId;
	
	@Id
	private String user_loginId;
	private String user_password;
	private String user_fname;
	private String user_mname;
	private String user_lname;
	private String user_email;
	private String user_mobile;
	private int user_age;
	
	//@OneToOne(mappedBy="user")
	
	
	
	public long getUser_regId() {
		return user_regId;
	}
	public void setUser_regId(long user_regId) {
		
		this.user_regId = user_regId;
	}
	public String getUser_loginId() {
		return user_loginId;
	}
	public void setUser_loginId(String user_loginId) {
		this.user_loginId = user_loginId;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public String getUser_mname() {
		return user_mname;
	}
	public void setUser_mname(String user_mname) {
		this.user_mname = user_mname;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_mobile() {
		return user_mobile;
	}
	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}
	
	

	
}



