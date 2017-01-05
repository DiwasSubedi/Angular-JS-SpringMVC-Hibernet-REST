package com.david.repoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.david.domain.BankAccount;
import com.david.domain.Person;
import com.david.reposiotory.BankRepo;


@Repository
public class BankRepoImpl implements BankRepo {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<BankAccount> getAll() {
		Session session = sessionFactory.openSession();
		List<BankAccount> bankList = session.createQuery("from BankAccount").list();
		session.close();
		return bankList;
	}
	
	
	
}
