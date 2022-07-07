package Basic_programme;

import java.util.Scanner;

public class Swap_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Swap numbers ");
		System.out.print("Enter first number = ");
		int a = s1.nextInt();
		System.out.print("Enter Second number = ");
		int b = s1.nextInt();
		System.out.println("Before Swap Your number A : " + a + " And B : " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap value A : "+a+ " And B : "+b);
	}

}
