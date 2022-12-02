package com.construct;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConctructorApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		//Employee eob=(Employee) ctx.getBean("employee");
		

	}

}
