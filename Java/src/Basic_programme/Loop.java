package Basic_programme;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		// For loop
//		for (int i = 1; i <= 10; i++) {
//			// System.out.print(" "+i+" ");
//		}
//------------------------------------------------------
		// while Loop
//		int a = 1;
//		while (a <= 10) {
//			System.out.print(" " + a + " ");
//			// System.out.println("Hello");
//			a = a + 1;
//		}
//--------------------------------------------------------
		// Do Loop
//		int b = 1;
//		do {
//			System.out.print(" " + b + " ");
//			b = b + 1;
//		} while (b <= 10);
//--------------------------------------------------------
//		int c=0;
//		do {
//			Scanner s1 = new Scanner(System.in);
//			System.out.println("Input a number");
//			c = s1.nextInt();
//			System.out.print("here is your number :");
//			System.out.println(c);
//		}while(c>=0);
//		
//		System.out.println("The End");
//------------------------------------------------------------
		int i = 1;
		while (true) {
			if(i == 3 || i == 7){
				i = i+1;
				continue;
			}
			System.out.print(" " + i + " ");
			i = i+1;
			if (i > 10) {
				break;
			}
		}
//---------------------------------------------------------------
	}
}
