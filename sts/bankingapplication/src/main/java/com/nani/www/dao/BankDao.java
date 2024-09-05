package com.nani.www.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nani.www.entity.Bank;

@Repository
public interface BankDao extends JpaRepository<Bank, Long> {
	
	
}