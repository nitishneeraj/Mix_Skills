package Basic_programme;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Armstrong  numbers like (153,370,1634..)");
		System.out.print("Enter the number : ");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b, sum = 0, temp = a;
		while (a > 0) {
			b = a % 10;
			sum = sum + (b * b * b);
			a = a / 10;
		}
		if (sum == temp) {
			System.out.println(temp + " Armstrong  number");
		} else {
			System.out.println(temp + " Not Armstrong number");
		}
	}
}
