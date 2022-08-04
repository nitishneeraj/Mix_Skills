package Java_Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Class {

	public static void main(String[] args) {
		//Set<String> set=new HashSet<String>();  
		Set<String> set=new LinkedHashSet(); 
		//Set<String> set=new TreeSet<String>(); 
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.print(itr.next()+" ");  
		}  
		System.out.println();
		System.out.println(set);
		
		System.out.println(set.remove("Ravi"));
		System.out.println(set);
		
		System.out.println(set.contains("Priya"));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
	}
}
