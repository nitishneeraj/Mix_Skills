package Basic_programme;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class java_queue {
	public static void main(String[] args) {
		java_queue s1 = new java_queue();
		s1.thread2();
	}

	Queue<Integer> thread1() {
		Scanner s1 = new Scanner(System.in);
		Queue<Integer> q= new LinkedList<Integer>();
		int a = s1.nextInt();
		q.add(a);
		return q;
		}
		
	
	void thread2() {
		//System.out.println("hello");
		System.out.println(thread1());
	}

}
