package Basic_programme;

import java.util.Scanner;

public class mini_project {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int number =0;
		int mynumber = (int)(Math.random()*100);
		do {
			System.out.print("Guess my number :");
		    number = s1.nextInt();
			if(mynumber == number) {
				System.out.println("Your Number is correct ");
				break;
			}
			else if(mynumber < number) {
				System.out.println("Your number to larger ..");
			}
			else {
				System.out.println("Your number to Small");
			}
		}while(number >= 0);
		
		System.out.println("The End");
	}
}
