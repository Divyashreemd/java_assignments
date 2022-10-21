package com.valtech.account.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Account {
	
	public static final String SAVING ="SB";
	public static final String CURRENT ="CA";
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String accountType;
	private double balance;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdateDate;
	private boolean active;
	@ManyToMany(targetEntity=Customer.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	
	private Set<Customer> customers;
	public Account(){
		
	}
	
	public Account(long id, String accountType, double balance, LocalDateTime creationDate, LocalDateTime lastUpdateDate,
			boolean active) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
		this.active = active;
	}
	
	

	public Account(String accountType, double balance) {
		super();
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate=LocalDateTime.now();
		this.lastUpdateDate=LocalDateTime.now();
		this.active=false;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
public void setCustomers(Set<Customer> customers) {
	this.customers = customers;
}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
