package com.SpringCore.autoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/autoWire/config.xml");
		Emp E1 = (Emp)context.getBean("E1");
		System.out.println(E1);
	}
}
