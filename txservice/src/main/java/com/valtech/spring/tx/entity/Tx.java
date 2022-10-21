package com.valtech.spring.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="alltxs")
@DiscriminatorColumn(name="disc")
@DiscriminatorValue("tx")
public class Tx {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private float amount;
	private boolean debit;
	private LocalDateTime txTimr;
	private long accountId;
	
	public Tx() {
	}
	
	
	
	public Tx(float amount) {
		super();
		this.amount = amount;
	}
	



	public Tx(float amount, boolean debit, LocalDateTime txTimr, long accountId) {
		super();
		this.amount = amount;
		this.debit = debit;
		this.txTimr = txTimr;
		this.accountId = accountId;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public boolean isDebit() {
		return debit;
	}
	public void setDebit(boolean debit) {
		this.debit = debit;
	}
	public LocalDateTime getTxTimr() {
		return txTimr;
	}
	public void setTxTimr(LocalDateTime txTimr) {
		this.txTimr = txTimr;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	

}
