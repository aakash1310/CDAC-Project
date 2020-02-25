package com.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="wallet_account_table")
public class WalletAccount 
{	
	
	@GeneratedValue
	private int wallet_id;
	
	//private long account_no;
	
	private int amount;
	
	//	@OneToOne
//	@JoinColumn(name="loginId")
	@Id
	private String loginId;

	
	
	public int getWallet_id() {
		return wallet_id;
	}

	public void setWallet_id(int wallet_id) {
		this.wallet_id = wallet_id;
	}

//	public long getAccount_no() {
//		return account_no;
//	}
//
//	public void setAccount_no(long account_no) {
//		this.account_no = account_no;
//	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	
	
	
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//	
	
}
