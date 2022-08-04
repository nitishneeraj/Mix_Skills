package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Class {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(46);
		list.add(67);
		list.add(24);
		list.add(16);
		list.add(8);
		list.add(12);
		System.out.println(list);
		System.out.println(Collections.addAll(list, 33, 55));
		System.out.println(list);
		System.out.println("maximum element list: " + Collections.max(list));
		System.out.println("maximum element list: " + Collections.min(list));
		Collections.sort(list);
		System.out.println(list);
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
		 Collections.sort(list,Collections.reverseOrder()); 
		 System.out.println();
		System.out.print(list+" ");
	}

}
