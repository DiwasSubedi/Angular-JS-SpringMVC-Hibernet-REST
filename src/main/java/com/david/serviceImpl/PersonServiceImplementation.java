package com.david.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.david.Service.PersonService;
import com.david.domain.Person;
import com.david.repoImpl.PersonRepoImpl;
import com.david.reposiotory.PersonRepo;


@Service
@Transactional
public class PersonServiceImplementation implements PersonService{
	@Autowired
	PersonRepo personrepo;

	@Override
	public void save(Person p) {
		personrepo.save(p);
		
	}
	
	@Override
	public List<Person> getAll() {
		return personrepo.getAll();
	}

	@Override
	public Person searchByName(String name) {
		
		return personrepo.searchByName(name);
	}

	
	
}
