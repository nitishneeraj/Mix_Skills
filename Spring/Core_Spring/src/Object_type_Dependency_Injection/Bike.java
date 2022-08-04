package Object_type_Dependency_Injection;

public class Bike {
	
	Engine engine;
	
	public Bike(Engine engine) {
		this.engine = engine;
	}
	
	public void startEngine() {
		if(engine == null) {
			System.out.println("Unable to start your engine");
		}else {
			engine.start();
		}
	}

}
