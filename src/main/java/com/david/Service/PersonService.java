package com.david.Service;

import java.util.List;

import com.david.domain.Person;

public interface PersonService {
	public void save(Person p);
	public List<Person> getAll();
	public Person searchByName(String name);
}
