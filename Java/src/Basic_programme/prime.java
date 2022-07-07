package Basic_programme;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Find Prime number");
		System.out.print("Enter the number : ");
		int n = s1.nextInt();
		if (isprime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	public static boolean isprime(int n) {
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
