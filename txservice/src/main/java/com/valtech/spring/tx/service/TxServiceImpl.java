package com.valtech.spring.tx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.spring.tx.entity.Tx;
import com.valtech.spring.tx.repo.TxRepository;

@Service
public class TxServiceImpl implements TxService {
	
	@Autowired
	private TxRepository txRepository;
	
	@Override
	public Tx createTx(Tx x){
		return txRepository.save(x);
	}
	
	@Override
	public Tx getTxById(long id){
		return txRepository.findById(id).get();
	}
	


}
