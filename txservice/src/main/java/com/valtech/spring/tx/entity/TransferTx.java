package com.valtech.spring.tx.entity;

import javax.persistence.Entity;

@Entity
public class TransferTx  extends Tx{
	
	private String frommAccount;
	private String toAccount;
	
	public TransferTx(){
		
	}
	
	public TransferTx(float amount,String frommAccount, String toAccount) {
		super(amount);
		this.frommAccount = frommAccount;
		this.toAccount = toAccount;
	}

	public String getFrommAccount() {
		return frommAccount;
	}
	public void setFrommAccount(String frommAccount) {
		this.frommAccount = frommAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	
	
	

}
