package Basic_programme;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		System.out.println("Find Sorting ");
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		int a = s1.nextInt();
		int arr[] = new int[a];
		int temp;
		System.out.println("Enter the numbers : ");
		for (int i = 0; i < a; i++) {
			arr[i] = s1.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println("After sorting Numbers");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
