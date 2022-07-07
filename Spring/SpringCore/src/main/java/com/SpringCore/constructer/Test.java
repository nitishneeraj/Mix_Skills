package com.SpringCore.constructer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/constructer/config.xml");
		Person E1 = (Person)context.getBean("person");
		System.out.println(E1);

	}

}
