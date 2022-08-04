package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeNap_Class {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		map.put(104, "Balu");
		map.put(105, "prakash");
		map.put(106, "Satya");
		map.put(107, "Sohan");
		map.put(108, "Rohan");
		map.put(109, "Babli");
		System.out.println("Before invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.remove(102);
		System.out.println("After invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("descendingMap: " + map.descendingMap());

		// Returns key-value pairs whose keys are less than the specified key.
		System.out.println("headMap: " + map.headMap(104));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(103));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, 108));
	}
}
