package Object_type_Dependency_Injection;

public class Car {

	Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void startEngine() {
		if (engine == null) {
			System.out.println("Unable to start your engine");
		} else {
			engine.start();
		}
	}
}
