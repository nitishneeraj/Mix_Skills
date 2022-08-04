
public class Chalange_Bill {
	public static void main(String[] args) {

		int Unit = 13;
		int sum = 0;
		int Govt_charge = 80;
		for (int i = 1; i <= Unit; i++) {
			if (i <= 50) {
				sum = sum + 3;
			} else if (i <= 150) {
				sum = sum + 5;
			} else {
				sum = sum + 10;
			}
		}
		System.out.println(sum + Govt_charge);
	}
}
