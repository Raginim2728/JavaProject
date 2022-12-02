package com.onetoonerelation;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmpAddress {

	public static void main(String[] args) {
		//Create configuration
				Configuration config=new Configuration();
				config.configure("hibernate.cfg.xml");
				config.addAnnotatedClass(Employee.class);
				config.addAnnotatedClass(Address.class);
			//Configuration config1=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
			
				//create SessionFactory 
				SessionFactory sf=config.buildSessionFactory();
				Session ss=sf.openSession();
				Transaction t=ss.beginTransaction();
				Employee eob=new Employee();
				eob.setEmployeeName("Raji");
				eob.setDoj(new Date());
				eob.setEmail("raji@yahoo.com");
				eob.setSalary(6754.00);
				//First address
				Address aob1=new Address();
				aob1.setCity("chennai");
				aob1.setPincode(866668l);
				aob1.setState("tamillnadu");
				aob1.setStreet("abc street");
				
				//second address
				Address aob2=new Address();
				aob2.setCity("Mangalore");
				aob2.setPincode(966668l);
				aob2.setState("karnadaka");
				aob2.setStreet("xyz street");
				
				eob.getAddresslist().add(aob1);
				eob.getAddresslist().add(aob2);
				
				///Manytoone
				aob1.setEmployee(eob);
				aob2.setEmployee(eob);
				ss.save(eob);
				t.commit();
				
				//get the data
				Employee e1=null;
				e1=ss.get(Employee.class,1);
				
				System.out.println(e1.toString());
				
	}
	
}
