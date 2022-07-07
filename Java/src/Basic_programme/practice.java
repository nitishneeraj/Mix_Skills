package Basic_programme;

public class practice extends test {
	public static void main(String[] args) {
		test p1 = new test();
		 p1.sqrt(21);
		// -----------------
		p1.mode(21, 2);
	}
}

class test {
	void sqrt(int n) {
		System.out.println("Math.sqrt(" + n + ")=" + Math.sqrt(n));
	}

	void mode(int a, int b) {
		int c, d;
		c = a / b;
		d = a % b;
		System.out.println("Divide =" + c);
		System.out.println("Mode =" + d);
	}
}
