package com.SpringCore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Collection/config.xml");
		Emp E1 = (Emp)context.getBean("Emp");
		System.out.println(E1);
		System.out.println(E1.getName());
		System.out.println(E1.getAddresses());
		System.out.println(E1.getPhone());
		System.out.println(E1.getCourses());
	}

}
