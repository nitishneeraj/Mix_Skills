package Object_type_Dependency_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Bike bike = (Bike) context.getBean("Bike");
		bike.startEngine();
		
		Car car = (Car) context.getBean("Car");
		car.startEngine();
	}

}
