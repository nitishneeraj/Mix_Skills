package com.Spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/core/config.xml");
		Student st = (Student)context.getBean("student");
		System.out.println(st);
		Student st1 = (Student)context.getBean("student1");
		System.out.println(st1);
		
	}
}
