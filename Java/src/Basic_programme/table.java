package Basic_programme;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		System.out.println("Write any table");
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter any number :");
		int a = s1.nextInt();
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = a * i;
			System.out.println(a + "*" + i + "=" + sum);
		}
	}
}
