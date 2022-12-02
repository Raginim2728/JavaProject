package com.javaone;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmpAddress {

	public static void main(String[] args) {
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				con.addAnnotatedClass(Employee.class);
				con.addAnnotatedClass(Address.class);
			//Configuration config1=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
			
				//create SessionFactory 
				SessionFactory cf=con.buildSessionFactory();
				Session cs=cf.openSession();
				Transaction t=cs.beginTransaction();
				Employee eob=new Employee();
				eob.setEmployeeName("pavi");
				eob.setDoj(new Date());
				eob.setEmail("pavi@yahoo.com");
				eob.setSalary(6754.00);
				
				Address aob=new Address();
				aob.setCity("nagercoil");
				aob.setPincode(629302l);
				aob.setState("Tamilnadu");
				aob.setStreet("XYZ street");
				
				//ref of address save in employee
				eob.setAddress(aob);
				cs.save(eob);
				t.commit();
				
				//get the data
				Employee e1=null;
				e1=cs.get(Employee.class,1);
				Address a1=e1.getAddress();
				System.out.println(e1.toString());
				System.out.println(a1.toString());
	}
	
}