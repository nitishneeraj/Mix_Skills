package Java_Collection_Framework;

import java.util.Iterator;
import java.util.Stack;

public class Stack_class {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();  
		st.push("Ayush");  
		st.push("Garvit");  
		st.push("Amit");  
		st.push("Ashish");  
		st.push("Garima");  
		st.pop();  //top ko remove kr ke next elements ko show krega
		Iterator<String> itr=st.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
		}
		System.out.println("Top Elements :- "+st.peek());
		st.pop();
		System.out.println("Top Elements :- "+st.peek());
	}
}
