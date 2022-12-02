package com.springcon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	Student sob=(Student) ctx.getBean("student");
	sob.display();
	Student sob1=(Student) ctx.getBean("student1");
	sob1.display();

	}

}
