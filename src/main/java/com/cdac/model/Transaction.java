package com.cdac.model;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Transaction 
{
	
	@Id
	@GeneratedValue
	private int txno;
	
	private LocalDateTime dateAndTime;
	
	private String txType;
	
	private double txAmount;
	
	@ManyToOne
	@JoinColumn(name = "wallet_Id_no")
	private WalletAccount wallet_Id_no;

	public int getTxno() {
		return txno;
	}

	public void setTxno(int txno) {
		this.txno = txno;
	}

	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public double getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(double txAmount) {
		this.txAmount = txAmount;
	}

	public WalletAccount getWallet_Id_no() {
		return wallet_Id_no;
	}

	public void setWallet_Id_no(WalletAccount wallet_Id_no) {
		this.wallet_Id_no = wallet_Id_no;
	}
	
	

	
}
