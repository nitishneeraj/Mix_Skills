package Basic_programme;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Find Reverse Numbers");
		int rev = 0, b;
		System.out.print("Enter number : ");
		int a = s1.nextInt();
		while (a != 0) {
			b = a % 10;
			rev = rev * 10 + b;
			a = a / 10;
		}
		System.out.println(rev);
	}
}
