package com.david.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.Service.BankService;
import com.david.domain.BankAccount;
import com.david.reposiotory.BankRepo;


@Service
public class BankServiceImpl implements BankService {

	
	@Autowired
	BankRepo bankrepo;
	
	
	@Override
	public List<BankAccount> getAll() {
		// TODO Auto-generated method stub
		return bankrepo.getAll();
	}

}
