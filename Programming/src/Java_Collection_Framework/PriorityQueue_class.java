package Java_Collection_Framework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_class {

	public static void main(String[] args) {
		
		//Let line kisi bhi elements ko value dena chahte ho to  
		PriorityQueue<String> queue = new PriorityQueue<String>();
		//sbse chhota elements show krta h
		queue.add("Vijay Raj");
		queue.add("Amit Sharma");
		queue.add("JaiShankar");
		queue.add("Raj");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());//next ticket person
		System.out.println("\niterating the queue elements:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println(queue.remove());
		//System.out.println(queue.poll());
		System.out.println("\nafter removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
