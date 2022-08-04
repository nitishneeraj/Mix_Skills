package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys {

	public void run(Engine Key) {
		Key.start();
	}
}

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // Type Casting
		Engine All_key = (Engine) context.getBean("engine");// Bean ID(engine)
		new Keys().run(All_key);// Create class Obj Call call Method

	}

}
