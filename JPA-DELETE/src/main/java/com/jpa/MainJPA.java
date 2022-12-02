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
    
    Query query = em.createQuery( "delete from StudentsJpa where id=1");  
     query.executeUpdate();  

   em.getTransaction().commit();

	}
}


