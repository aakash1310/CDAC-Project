package com.cdac.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.WalletDao;
import com.cdac.model.Transaction;
import com.cdac.model.WalletAccount;

@Service
public class WalletService 
{
	@Autowired
	WalletDao walletDao;
	
//	public void addRetrieve(WalletAccount WalletAcc) 
//	{
//		
//		walletDao.upsertMoney(WalletAcc);
//
//	}
	
	public int payToll(String loginId, int amt) 
	{
		
		WalletAccount walletAcc=new WalletAccount();
		//walletAcc.setLoginId(loginId);
		WalletAccount walletAcc1 = walletDao.fetch(loginId,amt);
		//walletAcc1.setLoginId(loginId);
		//System.out.println(walletAcc1.getAmount()+"=================================");
		int amey=walletAcc1.getAmount()-amt;
		//System.out.println(amey+"ameyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
		walletAcc1.setAmount(amey);
		
		
		
		int rem_bal=walletDao.upsertMoney(walletAcc1);
		return rem_bal;
		
		//Transaction tx = new Transaction();
		//tx.setDateAndTime(LocalDateTime.now());
		//tx.setTxType("Withdrawn");
		//tx.setTxAmount(amt);
		//tx.setWallet_Id_no(walletAcc);
		
		//walletDao.upsertMoney(tx);
	}

}
