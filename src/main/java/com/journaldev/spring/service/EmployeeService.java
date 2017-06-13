package com.journaldev.spring.service;

import javax.persistence.EntityManager;

//Spring service is the interaction point between presentation layer and persistence layer. 
//If you’re familiar with DAO, you can consider it something similar.

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.jpa.data.Employee;

//EntityManager is injected using @PersistenceContext annotation. Even you’ve defined an instance of 
//EntityManagerFactory, but a JPA implementation will be very smart to inject you an instance of 
//EntityManager. EntityManager would be something similar for Session in Hibernate. In case you’ve 
//invoked any of its CRUD operation within both of context and active transaction, your operation would 
//be persisted against your persistence store. Note that em.persist() and using of @Transactional 
//annotation upon register method.


@Component
public class EmployeeService {
	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void register(Employee emp) {
		// Save employee
		this.em.persist(emp);
	}

}
