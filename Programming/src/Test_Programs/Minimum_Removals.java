package Test_Programs;

public class Minimum_Removals {

	public static void main(String[] args) {

		// Minimum Removals to Make Sum Even
		System.out.println(Removals());
	}

	static int Removals() {
		int a[] = { 1, 4, 5, 7, 8 };
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result = result + a[i];
		}
		//System.out.println(result);
		if (result % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}

}
