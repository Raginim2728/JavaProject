package com.jpa;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainJPA {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	//Query query=em.createQuery("select name from studentsJpa");
	Query query=em.createQuery("select name from StudentsJpa");

	@SuppressWarnings("unchecked")
	List<String> list=query.getResultList();
	System.out.println(" Student name");
	for(String s: list) {
		System.out.println(s);
	}
}
}

