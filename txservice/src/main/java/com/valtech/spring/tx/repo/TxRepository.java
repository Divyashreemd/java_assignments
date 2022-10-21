package com.valtech.spring.tx.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.spring.tx.entity.Tx;

@Repository
public interface TxRepository  extends JpaRepository<Tx,Long>{

}
