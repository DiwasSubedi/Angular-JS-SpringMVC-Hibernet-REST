package com.david.reposiotory;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.david.domain.BankAccount;


public interface BankRepo {
	
	public List<BankAccount> getAll();

}
