package com.valtech.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.account.entity.Account;
import com.valtech.account.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
//	@Autowired
//	private Account account;

	@Override
	public Account createAccount(Account acc){
		return accountRepository.save(acc);
		
	}
	
	@Override
	public Account updateAccount(Account acc){
		return accountRepository.save(acc);
	}
	
	@Override
	public Account getAccount(long id){
		return accountRepository.findById(id).get();
	}
	
	@Override
	public List<Account> getAllAccounts(){
		return accountRepository.findAll();
	}

	@Override
	public Account createSavingAccount(double balance) {
//		 account.setAccountType(account.SAVING);
	       Account a=new Account("SB",balance);
	       return accountRepository.save(a);
	      
	}

	@Override
	public Account createCurrentAccount(double balance) {
//		  account.setAccountType(account.CURRENT);
	        Account a =new Account("CR",balance);
	        return accountRepository.save(a);
	}

	
	
}
