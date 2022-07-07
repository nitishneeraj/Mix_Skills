package Basic_programme;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Find factorial ");
		System.out.print("Enter any number : ");
		int a = s1.nextInt();
		int sum = 1;
		for (int i = a; i > 1; i--) {
			sum = sum * i;
		}
		System.out.println("Your factorail numbers :- " + sum);
	}

}
