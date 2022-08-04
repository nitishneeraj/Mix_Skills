package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Class {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");

//		if(!map.containsKey(1)) {
//			map.put(1, "Berlin");
//		}

		map.putIfAbsent(1, "Berlin");

		System.out.println(map);

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println();
		
		for (Integer key : map.keySet()) {
			System.out.print(key+" ");
		}
		System.out.println();
		for (String valuse : map.values()) {
			System.out.print(valuse+" ");
		}
		System.out.println();
		
		System.out.println(map.containsValue("Tiger"));
		System.out.println(map.containsKey(3));
		System.out.println(map.isEmpty());
		map.remove(2);
		System.out.print(map+" ");
		System.out.println();
		map.put(2, "Apple");
		System.out.print(map+" ");
		System.out.println("Updated list of elements:");  
	     map.replace(2, "Gaurav");  
	     for(Map.Entry m:map.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }
	     map.replaceAll((k,v) -> "Goa");  
	     System.out.println(map);
	}
}
