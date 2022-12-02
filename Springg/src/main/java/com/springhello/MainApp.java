package com.springhello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		HelloSpring1 hob=(HelloSpring1) context.getBean("helloworld");
		hob.display();

	}

}

