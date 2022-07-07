package Basic_programme;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Palindrome numbers like-> 121,12321,...");
		System.out.print("Enter any number =");
		int a = s1.nextInt();
		int temp = a,sum = 0, n;
		while (a > 0) {
			n = a % 10;
			sum = sum * 10 + n;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println(sum+" Palindrome Number");
		} else {
			System.out.println(sum+" Not Palindrome Number");
		}
	}

}
