package com.SpringCore.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Reference/config.xml");
		A a1 = (A)context.getBean("aref");
		System.out.println(a1.getX());
		System.out.println(a1.getOb().getY());

	}

}
