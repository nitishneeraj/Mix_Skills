package Java_Collection_Framework;

import java.util.ArrayDeque;

public class LeanArrayDeque {
	//This type of array elements are retrieve both side
	public static void main(String[] args) {
		
		ArrayDeque<Integer> DQ = new ArrayDeque<>();
		DQ.offer(22);
		DQ.offer(24);
		DQ.offerFirst(20);
		DQ.offerLast(25);
		System.out.println(DQ);
		
		System.out.println(DQ.peek());
		System.out.println(DQ.peekFirst());
		System.out.println(DQ.peekLast());
		
		System.out.println(DQ.poll());
		System.out.println(DQ);
		
		System.out.println(DQ.peekFirst());
		System.out.println(DQ);
		
		System.out.println(DQ.peekLast());
		System.out.println(DQ);
		
	}

}
