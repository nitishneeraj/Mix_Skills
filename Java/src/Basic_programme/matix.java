package Basic_programme;

public class matix {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int c[][] = new int[3][3]; // 3 rows and 3 columns

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int j2 = 0; j2 < 3; j2++) {
					c[i][j] += a[i][j2] * b[j2][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
