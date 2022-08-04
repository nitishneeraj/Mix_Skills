package Dependency_Injection;

public class Bike {
	// Create Object
	// Management
	// Inject though Object

	// String Ek class hai java me so n ull value return if <property name="color"
	// value="Red" />
	String co;// = "red";

	// First Way setter method
	public void setColor(String color) {
		this.co = color;
		System.out.println("I am setter!!");
	}

	// Second Way Using Constructor
	public Bike(String color) {
		this.co = color;
		System.out.println("I am Constructor!!");
	}

	public void showColor() {
		System.out.println("Your Color is = " + co);
	}

}
