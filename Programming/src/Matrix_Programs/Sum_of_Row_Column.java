package Matrix_Programs;

public class Sum_of_Row_Column {
	void SumofRowColumn() {
		int rows, cols, sumRow, sumCol;

		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Calculates number of rows and columns present in given matrix
		rows = a.length;
		cols = a[0].length;

		// Calculates sum of each row of given matrix
		System.out.println();
		for (int i = 0; i < rows; i++) {
			sumRow = 0;
			for (int j = 0; j < cols; j++) {
				sumRow = sumRow + a[i][j];
			}
			System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
		}

		// Calculates sum of each column of given matrix
		System.out.println();
		for (int i = 0; i < cols; i++) {
			sumCol = 0;
			for (int j = 0; j < rows; j++) {
				sumCol = sumCol + a[j][i];
			}
			System.out.println("Sum of " + (i + 1) + " column: " + sumCol);
		}
	}

}
