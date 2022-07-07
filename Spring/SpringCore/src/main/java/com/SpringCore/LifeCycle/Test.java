package com.SpringCore.LifeCycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/LifeCycle/config.xml");
		context.registerShutdownHook();
//		Samosa E1 = (Samosa)context.getBean("s1");
//		System.out.println(E1);
//		
//		System.out.println("===================================================");
//		Pepsi p1 = (Pepsi)context.getBean("p1");
//		System.out.println(p1);
		
		Example a1 = (Example)context.getBean("Example");
		System.out.println(a1);
		

	}

}
