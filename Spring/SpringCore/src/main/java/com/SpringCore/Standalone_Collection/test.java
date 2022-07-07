package com.SpringCore.Standalone_Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Standalone_Collection/config.xml");
		Person E1 = (Person)context.getBean("p1");
		System.out.println(E1);
		System.out.println(E1.getFriends().getClass().getName());
		System.out.println("====================================================");
		System.out.println(E1.getFeeStructure());
		System.out.println(E1.getFeeStructure().getClass().getName());
		System.out.println("----------------------------------------------------");
		System.out.println(E1.getProp());
		System.out.println(E1.getProp().getClass().getName());
	}

}
