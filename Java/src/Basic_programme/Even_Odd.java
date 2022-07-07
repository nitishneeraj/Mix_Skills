package Basic_programme;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Find Even number between range ");
		System.out.print("Enter start point : ");
		int start = s1.nextInt();
		System.out.print("Enter End point : ");
		ArrayList thearray = new ArrayList();
		int end = s1.nextInt();
		for (int i = start; i < end; i++) {
			if (i % 2 == 0) {
				thearray.add(i);
			}
		}
		System.out.println("Even numbers:- "+thearray);
	}

}

