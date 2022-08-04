package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_Arrray_to_list {

	public static void main(String[] args) {
		String[] array = {"Sohan","Mohan","Rakesh","Satya"};
		System.out.println(Arrays.toString(array));
		//Converting array to list
		List<String> list = new ArrayList<String>();
		for (String string : array) {
			list.add(string);
		}
		System.out.print(list+" ");
		System.out.println();
	}
}
