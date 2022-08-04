package Java_Collection_Framework;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Array_List {
	
	
	static void ArrayList() {
		ArrayList<String> list = new ArrayList<>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.print(itr.next()+" ");  
		} 
		System.out.println();
	}
	
	
	static void ArrayList_method() {
//	    default n =10;
//		increment
//	   Size = n +n/2+1
		
		int array[] = new int[3];
		
		//array[3] = 5;
		//Index 3 out of bounds for length 3
		//System.out.println(array[3]);
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    System.out.println(cars);
	    
	    cars.add("Toyota");
	    System.out.println(cars);
	    
	    cars.add("Skoda");
	    cars.add("KIA");
	    System.out.println(cars);
	    
	    
	    cars.add(3, "Range Rover");
	    System.out.println(cars);
	    
	    System.out.println(cars.get(3));
		
		//Clear all list
	    //cars.clear();
	    cars.remove(Integer.valueOf(30)); //if list me 30 hai to remove kr dega
	    System.out.println(cars);
	    
	    cars.set(2, "Audi");//update
	    System.out.println(cars);
	    
	    //ye value ko check krne ki liye use kiya jata h
	    System.out.println(cars.contains("Skoda"));
	    
	    for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i)+" ");
		}
	    System.out.println("*************");
	    
	    for (String string : cars) {
	    	System.out.print(string+" ");
		}
	    System.out.println("-------------");
	    
	    Iterator<String> it =cars.iterator();
	    while (it.hasNext()) {
			String string = (String) it.next();
			System.out.print(string+" ");
			
		}
		
	}
	
	

	public static void main(String[] args) {

		ArrayList();
		//ArrayList_method();
	    
	}

}
