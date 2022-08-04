package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convert_List_to_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruitList = new ArrayList<>();
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		
		String[] str = fruitList.toArray(new String[fruitList.size()]);
		System.out.println(Arrays.toString(str));
		for (String string : str) {
			System.out.println(string);
		}
	}

}
