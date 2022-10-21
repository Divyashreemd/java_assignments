package com.valtech.spring.tx.service;

import com.valtech.spring.tx.entity.Tx;

public interface TxService {

	Tx createTx(Tx x);

	Tx getTxById(long id);

}