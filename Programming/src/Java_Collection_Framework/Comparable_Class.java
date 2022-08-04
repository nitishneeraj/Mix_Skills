package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Class {
	public static void main(String[] args) {
		ArrayList<Student_Comparable> al = new ArrayList<Student_Comparable>();
		al.add(new Student_Comparable(101, "Vijay", 23));
		al.add(new Student_Comparable(106, "Ajay", 27));
		al.add(new Student_Comparable(105, "Jai", 21));

		Collections.sort(al);
		for (Student_Comparable st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
