package Basic_programme;

import java.util.Scanner;

class patterns {

	int scan() {
		System.out.println("Star patterns");
		System.out.print("Enter the number : ");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		return a;
	}

	void test1() {
		int b = scan();
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void test2() {
		int b = scan();
		for (int i = 0; i < b; i++) {
			for (int j = b; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void test3() {
		int a = scan();
		for (int i = 0; i < a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void test4() {
		int a = scan();
		for (int i = 0; i < a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void test5() {
		int a = scan();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = a; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	void test6() {
		int a = scan();
		for (int i = 0; i < a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = a; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	void test7() {
		int a = scan();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for (int j = 0; j < a; j++) {
			for (int i = a; i > j; i--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

	// ---------------------------------- Number Pattern -------------------------
	void number1() {
		int a = scan();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

	void number2() {
		int a = scan();
		int k = 1;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println(" ");
		}
	}
}

public class pattern extends patterns {
	public static void main(String[] args) {
		pattern p1 = new pattern();
		// p1.test1();
		// p1.test2();
		// p1.test3();
		// p1.test4();
		// p1.test5();
		// p1.test6();
		// p1.test7();
		// ------ Number pattern -------

		//p1.number1();
		p1.number2();
	}
}
