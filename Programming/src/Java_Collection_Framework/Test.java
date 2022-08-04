package Java_Collection_Framework;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		cout1();
		//cout();
	}

	static void cout1() {
		double d = 234.12413;
		String text = Double.toString(Math.abs(d));
		System.out.println(text);
		int integerPlaces = text.indexOf('.');
		int decimalPlaces = text.length() - integerPlaces - 1;
		//System.out.println(integerPlaces);
	}
	
	
	static void cout() {
		int count = 0;
		int num = 0003452;
	    while (num != 0) {
	      num /= 10;
	      ++count;
	    }
		System.out.println(count);
	}

}
 