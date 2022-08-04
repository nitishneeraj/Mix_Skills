package Java_Collection_Framework;
	
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("santosh");
		list.add("Rahul");
		list.add("Karan");
		list.add("Deepak");
		
		for (String string : list) {
			System.out.print(string+" ");
		}
		System.out.println();
	}

}
