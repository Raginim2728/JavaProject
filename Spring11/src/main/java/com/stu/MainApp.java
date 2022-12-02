package com.stu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		Student st=(Student) ctx.getBean("student");
		System.out.println("Hello "+st.getSname());

	}

}
