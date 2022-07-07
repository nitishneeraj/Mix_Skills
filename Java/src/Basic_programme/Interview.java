/*
  In loop 1..100
  if any number divide by 3 then print 3
  if any number divide by 5 then print 5
  if any number divide by both 3 & 5 then print 35

*/
package Basic_programme;

import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter number for loop");
		int a = s2.nextInt();
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("35");
		} else if (a % 3 == 0) {
			System.out.println("3");
		} else if (a % 5 == 0) {
			System.out.println("5");
		} else {
			System.out.println("India");
		}
	}

}
