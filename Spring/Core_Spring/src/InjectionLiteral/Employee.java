package InjectionLiteral;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("${employee.name}")
	private String name;

	@Value("${employee.id}")
	private int id;

	@Value("${employee.Skills}")
	private String Skills;

	public void showDetails() {
		System.out.println("Employee ID :- "+id);
		System.out.println("Employee Name :- " + name);
		System.out.println("Employee Skills :- " + Skills);
	}

}
