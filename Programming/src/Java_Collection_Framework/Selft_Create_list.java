package Java_Collection_Framework;

import java.util.HashSet;
import java.util.Set;

public class Selft_Create_list {

	public static void main(String[] args) {
		
		Set<Student> Obj = new HashSet<>();
		Obj.add(new Student(1,"Raja"));
		Obj.add(new Student(2,"Rajan"));
		Obj.add(new Student(3,"Rajesh"));
		Obj.add(new Student(1,"Rajender"));//becuse new obj create new hash code generated
		
		for (Student student : Obj) {
			System.out.println(student);
		}
	}
}
