package Basic_programme;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Find reverse String ");
		System.out.print("Enter String : ");
		String str =s1.nextLine();
		String revString = " ";
		for (int i = str.length()-1; i >= 0 ; i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println("Original String : "+str);
		System.out.println("Reverse of given string : "+revString);
	}

}
