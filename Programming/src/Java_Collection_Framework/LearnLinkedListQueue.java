package Java_Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
	
	public static void main(String[] args) {
		// just like tickets line 
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(1);
		qu.add(2);
		qu.add(4);
		qu.add(3);
//		for (Integer integer : qu) {
//			System.out.print(integer+" ");
//		}
		System.out.println(qu);
		System.out.println(qu.poll());//kon sa elements remove hoga
		System.out.println(qu);
		System.out.println(qu.peek());//next ticket person
		System.out.println(qu);
	}

}
