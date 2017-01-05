package com.david.reposiotory;

import java.util.List;

import com.david.domain.Person;

public interface PersonRepo {	
	public void save(Person person);
	public List<Person> getAll();
	public Person searchByName(String name);
}
