package Basic_programme;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class ReaderThread extends Thread{
	

	private Queue<Integer> q;
	
	public ReaderThread(Queue<Integer> q) {
		super();
		this.q = q;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("reader thread : "+this.q.poll());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class WriterThread extends Thread{
	
	private Queue<Integer> q;
	
	public WriterThread(Queue<Integer> q) {
		super();
		this.q = q;
	}

	@Override
	public void run() {
		while(true) {
			Integer i = new Random().nextInt();
			this.q.offer(i);
			System.out.println(" writer thread : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Main {
	
	public static void main(String[] args) throws InterruptedException {

		Queue<Integer> q = new LinkedList<Integer>(); 		
		new WriterThread(q).start();
		Thread.sleep(1000);
		new ReaderThread(q).start();
		
	}
	
}