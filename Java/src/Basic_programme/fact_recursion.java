package Basic_programme;

import java.util.Scanner;

public class fact_recursion {
	public static void main(String[] args) {
		fact_recursion thefact = new fact_recursion();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Factorial Using recursion ");
		System.out.print("Enter the numbers : ");
		int a = s1.nextInt();
		thefact.fact(a);
		System.out.println("Factorial using recursion = "+fact(a));
	}

	static int fact(int a) {
		if (a == 0) {
			return 1;
		} else {
			return a * fact(a - 1);
		}

	}
}
