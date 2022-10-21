package com.valtech.spring.tx.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.tx.entity.Tx;
import com.valtech.spring.tx.service.TxService;

@RestController
public class TxRestController {
	
	@Autowired
	private TxService txService;
	
	@PostMapping("/api/tx")
	public Tx createTransaction(@RequestBody Tx t1){
		return txService.createTx(t1);
	}

}
