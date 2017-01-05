package com.david.repoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.david.domain.Person;

import com.david.reposiotory.PersonRepo;

@Repository
public class PersonRepoImpl implements PersonRepo{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Person person) {
		
		Session sess = sessionFactory.getCurrentSession();
		sess.persist(person);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAll() {
		Session session = sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
	}

	@Override
	public Person searchByName(String name) {
		Session sess = sessionFactory.getCurrentSession();
		Criteria ctr = sess.createCriteria(Person.class);
        ctr.add(Restrictions.eq("fName",name));
        return (Person) ctr.uniqueResult();
	}
	
	
	

}
